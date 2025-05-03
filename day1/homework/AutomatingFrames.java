package week5.day1.homework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatingFrames {

	public static void main(String[] args) throws InterruptedException {
	
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Switch to Frame 
		
		WebElement iFrame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iFrame);
		System.out.println(iFrame);
		Thread.sleep(1000);
		
		//select the element 
		
		driver.findElement(By.xpath("//button[contains(@onclick,\"myFunction()\")]")).click();
		Thread.sleep(1000);
		
		//switch to alert 
		
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		Thread.sleep(1000);
		
		String textoutput = driver.findElement(By.id("demo")).getText();
		String text ="You pressed OK!";
		if(textoutput.equals(text))
		{
			System.out.println("Action Performed ");
		}
		
		else
			
		{
			System.out.println("Action not performed");
		}
		
		driver.close();
		
		
	}

}
