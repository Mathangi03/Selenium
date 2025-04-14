package week2.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountAssignment {

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.manage

		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Create Account

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester Homework");

		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(Industry);
		option.selectByIndex(3);

		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(Ownership);
		option2.selectByVisibleText("S-Corporation");

		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select option3 = new Select(Source);
		option3.selectByValue("LEAD_EMPLOYEE");

		WebElement Commerce = driver.findElement(By.id("marketingCampaignId"));
		Select option4 = new Select(Commerce);
		option4.selectByIndex(6);

		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option5 = new Select(State);
		option5.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		
		String Name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("The Account name is" +":" +Name);
		
		
		driver.close();

	}

}
