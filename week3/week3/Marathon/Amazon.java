package week3.Marathon;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		//Amazon search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(500);
		String output = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small')]//span[1]")).getText();
		System.out.println("The results are" +":"+output);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(500);
		String BagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("The bag name is" +":" +BagName);
		Thread.sleep(500);
		String Price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		System.out.println("The discounted price is" +":" +Price);
		Thread.sleep(500);
		String title = driver.getTitle();
		System.out.println("The webpage Title is"+":"+title);
		driver.close();
		}

}
