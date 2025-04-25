package week4.day2.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on contacts

		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Merge Contacts")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(500);

		// to find out the address of windows

		Set<String> windowHandles = driver.getWindowHandles();

		// convert set to list to switch between windows

		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println("The address of windows are : " + windows);

		// To switch to child window

		driver.switchTo().window(windows.get(1));
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		Thread.sleep(500);
		driver.switchTo().window(windows.get(0));
		Thread.sleep(500);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(1000);

		//to find out address of another window

		Set<String> windowHandles2 = driver.getWindowHandles();

		// convert set to list to switch between windows

		List<String> windows2 = new ArrayList<String>(windowHandles2);
		System.out.println("The address of windows are : " + windows2);
		
		driver.switchTo().window(windows2.get(1));
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		Thread.sleep(500);
		driver.switchTo().window(windows2.get(0));
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Thread.sleep(500);
		Alert alertwindow = driver.switchTo().alert();
		alertwindow.accept();
		Thread.sleep(1000);
		String titleOfPage = driver.getTitle();
		System.out.println("The webpage title is :" + titleOfPage);

	}

}
