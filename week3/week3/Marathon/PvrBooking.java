package week3.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class PvrBooking {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Book tickets

		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("(//li[@data-pc-section='item']//span)[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("(//li[@data-pc-section='item']//span)[2]")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		driver.findElement(By.xpath("//li[@data-pc-section='item']//span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[2]")).click();
		Thread.sleep(500);
		String SeatNum = driver.findElement(By.xpath("//div[@class='seat-number']//p")).getText();
		System.out.println("The Seat number is" +":" +SeatNum);
		Thread.sleep(500);
		String NetAmount = driver.findElement(By.xpath("//div[@class='grand-prices']//h6[1]")).getText();
		System.out.println("The ticket fare is" +":" +NetAmount);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		Thread.sleep(500);
		String title = driver.getTitle();
		System.out.println("The Webpage Title is" +":"+title);
		driver.close();

	}

}
