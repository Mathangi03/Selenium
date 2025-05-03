package week6.day1.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	public ChromeDriver driver;

	@BeforeMethod
	public void precondition() throws InterruptedException {

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver","path/to/driver/exe");	
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();

	}

	
	@AfterMethod
	
	public void postconditon() {
		driver.close();
	}

	}
