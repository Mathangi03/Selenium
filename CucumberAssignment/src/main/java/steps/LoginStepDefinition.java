package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver","path/to/driver/exe");	
		driver.manage().window().maximize();
		
	    
	}

	@And("Load the Url")
	public void load_the_url() {
		
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as(String username) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(1000);
	 
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String password) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
	    
	}

	@When("click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
	  
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
		
		System.out.println("Successfully logged into Salesforce");
	 
	}

	@And("Click on toggle button")
	public void click_on_toggle_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		
	  
	}

	@And("Click View All and then Click Sales from App launcher")
	public void click_view_all_and_then_click_sales_from_app_launcher() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@kx-scope='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("Sales");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='slds-truncate'])[3]")).click();
		Thread.sleep(3000);
	   
	}

	@And("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		
		WebElement Account = driver.findElement(By.xpath(
				"//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']//div[1]"));
		Thread.sleep(3000);
		Account.click();
	    
	}

	@And("Click on New button")
	public void click_on_new_button() throws InterruptedException {
		WebElement NewAccount = driver.findElement(By.xpath("//span[text()='New Account']"));
		//NewAccount.click();
		driver.executeScript("arguments[0].click()", NewAccount);
		Thread.sleep(1000);
	    
	}

	@And("Enter your name as Account name")
	public void enter_your_name_as_account_name() throws InterruptedException {
		
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("MathangiSekar");
		Thread.sleep(1000);
	  
	}

	@And("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		
		WebElement Ownership = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
		driver.executeScript("arguments[0].click()", Ownership);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		Thread.sleep(1000);
	   
	}

	@When("click on save")
	public void click_on_save() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(1000);
	  
	}

	@Then("Verify Account name")
	public void verify_account_name() {
		
		WebElement alertMessage  = driver.findElement(By.xpath("//a[@href='javascript:void(0)']//div[1]"));
		String actualText = alertMessage.getText();
		System.out.println("Account name Created is :" + actualText);
		driver.close();
	    
	}



}
