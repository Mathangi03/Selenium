package week4.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search bags 
		
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		



	}

}
