package week6.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClass {
	
	
    @Test
	public void runCreateNewOpportunity() throws InterruptedException {


// Click on toggle menu button
    	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);

//  Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);

//  Click Sales from App Launcher		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);

// Click on Opportunity tab 		
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();", opportunities);

// Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(2000);

// Enter Opportunity name & Store it
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
		oppName.sendKeys("Mathangi");
		
		//Enter Amount as 75000
		
		WebElement Amount = driver.findElement(By.xpath("//input[@name='Amount']"));
		Amount.sendKeys("75,000");
		Thread.sleep(2000);

// Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("//label[text()='Close
		// Date']/following::input[1]")).sendKeys("{{today}}");
// Select 'Stage' as Need Analysis
		
		WebElement Stage = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[1]"));
		driver.executeScript("arguments[0].click()", Stage);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		Thread.sleep(1000);

// click Save
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();

// VerifyOppurtunity Name		
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a"))
				.getAttribute("title");

		if (verifymsg.contains("Mathangi")) {
			System.out.println("New Oppurtunity Created");
		} else {
			System.out.println("Oppurtunity not Created");
		}
	}
}
