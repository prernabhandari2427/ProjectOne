package section12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class lecture94 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "/Users/prernabhandari/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companions");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Adding new code here");
		System.out.println("Adding new code here 22");
		System.out.println("This was added in master but not in test");
		
	}

}
 