package week6.Marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcases.ReadExcel;

public class BaseClass {

	public ChromeDriver driver;
	public String filename;
    
	@Parameters({"url" ,"username","password"})	
	@BeforeMethod
	public void precondition(String URL , String user , String Pass) throws InterruptedException {
		

		// Disable Notification		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");

				driver = new ChromeDriver(options);

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Get Url		
				driver.get(URL);

		// Enter Username & Password
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pass);
		// Click Login
				driver.findElement(By.xpath("//input[@id='Login']")).click();
				Thread.sleep(1000);
				

		
	}
	
	
	@AfterMethod
	public void postconditon() {
		driver.close();
		
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] readdata = ReadExcel.readData(filename);
		return readdata;
		
	}
	
	
}
	
	
	

		