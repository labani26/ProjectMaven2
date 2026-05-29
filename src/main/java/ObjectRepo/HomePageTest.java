package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageTest {

    WebDriver driver;

    // Constructor
    public HomePageTest(WebDriver driver) {

        this.driver = driver;
    }

    // Best Seller Menu
    public WebElement bestSeller() {

        return driver.findElement(
                By.xpath("/html/body/header/div[3]/div[2]/div/div[2]/div/div/div/div/nav/ul/li[4]/a"));
    }

    // First Best Seller Product
    public WebElement bestSeller1() {

        return driver.findElement(
                By.xpath("//*[@id='ajaxLoadData']/div[1]/div/div[2]/h2/a"));
    }

    // Second Best Seller Product
    public WebElement bestSeller2() {

        return driver.findElement(
                By.xpath("//*[@id='ajaxLoadData']/div[2]/div/div[2]/h2/a"));
    }

    // Third Best Seller Product
    public WebElement bestSeller3() {

        return driver.findElement(
                By.xpath("//*[@id='ajaxLoadData']/div[3]/div/div[2]/h2/a"));
    }
}