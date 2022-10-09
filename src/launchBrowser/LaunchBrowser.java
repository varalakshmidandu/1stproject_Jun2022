package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dandu\\June22_Selenium\\TstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	    driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		//driver.close();
		
	}
	
}
