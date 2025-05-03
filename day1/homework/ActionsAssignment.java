package week5.day1.homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {

		//ChromeOptions options = new ChromeOptions();
		EdgeDriver driver = new EdgeDriver();
		//options.addArguments("--disable-notifications");
		// options.addArguments("guest");
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// Search for oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus9 pro");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		String Price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price of the Product is" + Price);
		// click on rating
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover']")).click();
		Thread.sleep(500);
		// get rating
		String rating = driver.findElement(By.xpath("//h2[@id='acr-popover-title']//span[1]")).getText();
		System.out.println("The product rating is " + rating);
		//click on the first text link
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
		Thread.sleep(1000);
		//switch to new child window 
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		String titleofParent = driver.getTitle();
		System.out.println("The title of parent window"+ ":"+titleofParent);
		System.out.println("The address of windows are : " + windows);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(1000);
		String titleofChild = driver.getTitle();
		System.out.println("The title of child window"+ ":" +titleofChild);
		//take screenshot
		//click add to cart button 
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		Thread.sleep(5000);
		String cartTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Total price is :" +cartTotal);
		driver.quit();
	

	}

}
