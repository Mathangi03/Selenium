package week6.day1.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceTestleafDataProvider extends ProjectSpecificMethod {

	@DataProvider(name="fetchData")
	public String[][] sendData()
	{
		String[][] data=new String[2][1];
		data[0][0]="Salesforce Automation by Mat";
		data[1][0]="Salesforce Automation by MathS";
		
		return data;
		
		
	}

	@Test(dataProvider = "fetchData")
	public void runSalesforce(String LegalName) throws InterruptedException {

		// Press the toggle button

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@kx-scope='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("Legal Entities");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'slds-grid slds-has-flexi-truncate')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[contains(@class,'slds-context-bar__label-action slds-p-left_none slds-p-right_x-small')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@class,'slds-button slds-button--neutral')]//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(LegalName);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Company Name']/following::input")).sendKeys("Testleaf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')]//textarea)[2]")).sendKeys("Salesforces");
		
		WebElement selectStatus = driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']"));
		JavascriptExecutor status = (JavascriptExecutor) driver;
		status.executeScript("arguments[0].scrollIntoView({block: 'center'});", selectStatus);
		selectStatus.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='slds-combobox_container']//div[@aria-label='Status']/lightning-base-combobox-item[@data-value='Active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	
		WebElement alertMessage = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]"));
		String actualText = alertMessage.getText(); 
		System.out.println("The Message displayed is :" + actualText);
		
		

	}

}
