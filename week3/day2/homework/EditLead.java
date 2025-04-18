package week3.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		// Initialize chrome browser and open URL

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// login to URL

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("Mathangi");
	    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Sekar");
	    driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Maths");
	    driver.findElement(By.name("departmentName")).sendKeys("IT");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello Testleaf");
	    
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mathangi@gmail.com");
	    Thread.sleep(1000);
	    WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select option=new Select(state);
	    option.selectByVisibleText("New York");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    //Edit the entered values 
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Rewrite Hello Testleaf");
	    driver.findElement(By.name("submitButton")).click();
	    Thread.sleep(1000);
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    
	}

}
