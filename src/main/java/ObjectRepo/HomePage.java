package ObjectRepo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class HomePage {

	    WebDriver driver;

	    // Constructor
	    public HomePage(WebDriver driver) {

	        this.driver = driver;
	    }

	    // Today's Deal Element
	    public WebElement todaysDeal() {

	        return driver.findElement(
	                By.xpath("/html/body/header/div[3]/div[2]/div/div[2]/div/div/div/div/nav/ul/li[2]/a"));
	    }

	    // Best Seller Element
	    public WebElement bestSeller() {

	        return driver.findElement(
	                By.xpath("/html/body/header/div[3]/div[2]/div/div[2]/div/div/div/div/nav/ul/li[4]/a"));
	    }
	}


