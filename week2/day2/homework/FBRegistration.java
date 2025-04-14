package week2.day2.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegistration {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver = new EdgeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click new account button

		driver.findElement(By.linkText("Create new account")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// enter first name

		driver.findElement(By.name("firstname")).sendKeys("Testleaf");
		driver.findElement(By.name("lastname")).sendKeys("Automation");

		// select birthday

		WebElement birthday = driver.findElement(By.id("day"));
		Select day = new Select(birthday);
		day.selectByValue("3");

		// Select month
		WebElement month = driver.findElement(By.id("month"));
		Select birmonth = new Select(month);
		birmonth.selectByVisibleText("Jul");

		// select Year

		WebElement Year = driver.findElement(By.id("year"));
		Select biryear = new Select(Year);
		biryear.selectByValue("1992");

		// Select gender

		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();

		// enter phone number

		driver.findElement(By.name("reg_email__")).sendKeys("9922335634");

		// enter new password

		driver.findElement(By.id("password_step_input")).sendKeys("Hello@123");

		// click sign up
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("websubmit")).click();
	}

}
