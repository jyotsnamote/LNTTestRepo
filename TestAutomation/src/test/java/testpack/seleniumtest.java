package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumtest {
	@Test
	public void test() {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.google.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		System.out.println("+++++++++++++++++++++++++++++++++run+++++++++++++++");
		driver.close();
		 
		}
		 

}