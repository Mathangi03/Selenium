package week6.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunityUsingExcel extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename="CreateOpportunity";
	}
	
	
	@Test(dataProvider = "fetchData" )
		public void runEditOpportunity(String OpportunityName, String Account) throws InterruptedException {

		// Click on toggle menu button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// Click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		// Click on Opportunity tab
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[contains(@class,'test-listviewdisplayswitcher')]")).click();
		Thread.sleep(2000);
		

		WebElement Options = driver.findElement(By.xpath("//li[@class='slds-dropdown__item kanban']"));
		driver.executeScript("arguments[0].click();", Options);
		Thread.sleep(2000);   
                                                                                                                                                            
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Search this list...']//following::input[1]"));
		oppName.sendKeys(OpportunityName);
		Thread.sleep(2000);
		oppName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// ,Keys.ENTER);
		
		driver.findElement(By.xpath("//span[contains(@class,'slds-grid slds-grid_align-spread')]//a[1]")).click();
		Thread.sleep(2000);
		// 6. Click on the Dropdown icon and Select Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled fix-slds-button_icon-border-filled slds-button_last']")).click();
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("(//div[@part='menu-item']//a)[3]"));
		driver.executeScript("arguments[0].click();", edit);

		Thread.sleep(3000);
		WebElement element = driver.findElement(
				By.xpath("(//button[contains(@class,'slds-button trigger slds-button_icon-border')])[4]//span[2]"));
		driver.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[2]/td[3]")).click();

		Thread.sleep(3000);
		
		WebElement Stage = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		driver.executeScript("arguments[0].click()", Stage);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		Thread.sleep(1000);


		WebElement status = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[4]"));
		driver.executeScript("arguments[0].click()", status);

		//Actions delivery = new Actions(driver);
		//delivery.scrollToElement(status).perform();

		//driver.findElement(By.xpath("(//button[@role='combobox']//span)[4]")).click();

		driver.findElement(By.xpath("(//span[text()='In progress'])[1]")).click();

		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='80%'", "");
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");

		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();

		WebElement verify = driver.findElement(By.xpath("(//span[text()='Perception Analysis'])[3]"));

		System.out.println(verify.getText());

	}

}
