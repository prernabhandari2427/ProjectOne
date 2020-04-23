package section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.sun.tools.javac.util.List;



public class lecture94 {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "/Users/prernabhandari/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		setparams sp = new setparams();
		sp.setDate(driver);
		sp.setfrom(driver);
		sp.setTo(driver);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		if(driver.findElement(By.xpath("//div[@class='col-sm-12']//p")).getText().equals("No listing found")) {
			System.out.println("no listing , test case pass");
		}
	
	}
}
	
		
		


