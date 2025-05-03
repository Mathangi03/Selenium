package week5.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public ChromeDriver driver;

	@Parameters({"url" ,"username","password"})
	@BeforeMethod
	public void precondition(String URL , String user , String Pass) throws InterruptedException {

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver","path/to/driver/exe");	
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(Pass);
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();

	}

	
	@AfterMethod
	
	public void postconditon() {
		driver.close();
	}

	}
