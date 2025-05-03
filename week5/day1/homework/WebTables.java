package week5.day1.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Enter from and To station 
	
		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(2000);
		
		//Find train names from webtable 
	   List<WebElement> TrainName = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//td[2]"));
	   
	   
		 for(int i=0;i<TrainName.size();i++)
		 {
			 
			 String TrainList = TrainName.get(i).getText();
			 System.out.println("The Train names are :" +TrainList);
		 }

		 for(int i=0;i<TrainName.size();i++)
		 {
			 for(int j=i+1;j<TrainName.size();j++)
			 {
				 if (TrainName.get(i).equals(TrainName.get(j)))
				 {
					 System.out.print("The list contains Duplicate Train Names ");
				 }
				 
				 else 
					 
				 {
					 System.out.print("The List does not contain duplicate Train name");
				 }
			 }
		 }
		 
	
		
		

	}

}
