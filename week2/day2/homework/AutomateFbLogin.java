package week2.day2.homework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFbLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter email and Password

		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");

		driver.findElement(By.name("login")).click();

		// Click on find your account and login Link
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//get title of page 
		
		String title = driver.getTitle();
		
		System.out.println("The Title of the page is" +title);
		
		
		driver.close();
		

	
	}
}
