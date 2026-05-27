package exp.ProjectMaven2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserMainTest {
	
//	String browser = "Chrome";
//	Browser is already set to Chrome.
	
	public void BrowserOpen(String browser) {
		
//		Browser value will be given when calling the method.
		
		if(browser.equals("Chrome")) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://easycom.quickeselling.com/");
		}
		
		else if(browser.equals("Firefox")) {
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://easycom.quickeselling.com/");
		}
		
		else if(browser.equals("Edge")) {
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://easycom.quickeselling.com/");
		}
	}
}