package week3.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		// driver.manage

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Edit Lead

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("phoneNumber")).sendKeys("99");	
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();	
		
		//Click the first option 
		
		Thread.sleep(1000);
		String LeadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The first Lead Id in the page is" +" "+LeadId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();	
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("id")).sendKeys(LeadId);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);
		String output = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		System.out.println(output);
		driver.close();
		

	}

}
