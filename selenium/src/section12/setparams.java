package section12;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class setparams {
	



public  void setDate(WebDriver driver) {
	driver.findElement(By.id("travel_date")).click();
	driver.findElement(By.cssSelector("th.datepicker-switch")).click();
	driver.findElement(By.xpath("//div[@class='datepicker-months']//span[11]")).click();
	driver.findElement(By.xpath("//div[@class='datepicker-days']//table/tbody/tr/td[@class='old day'][text()='30']")).click();
	
}

public  void setfrom(WebDriver driver) {
	
	driver.findElement(By.id("travel_from")).click();
	driver.findElement(By.id("travel_from")).sendKeys("A");
	//System.out.println( "is displayed ::"+driver.findElement(By.xpath("//div[@id='ajax_listOfOptions']")).getText());
	try {
		Thread.sleep(1000L);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement peElement = driver.findElement(By.xpath("//div[@id='ajax_listOfOptions']"));
	peElement.findElement(By.id("Abilene")).click();
	
}


public  void setTo(WebDriver driver) {
	driver.findElement(By.id("travel_to")).click();
	driver.findElement(By.id("travel_to")).sendKeys("york");
	try {
		Thread.sleep(1000L);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	WebElement pelement = driver.findElement(By.xpath("//div[@id='ajax_listOfOptions']"));
	driver.findElement(By.xpath("(//div[contains(@id,'New York')])[1]")).click();
	
	}
}

	
	