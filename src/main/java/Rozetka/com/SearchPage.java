package Rozetka.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SearchPage {
    private WebDriver driver;
    private final By a = By.cssSelector("[href=\"http://rozetka.com.ua/computers-notebooks/c80253/\"][name=\"fat_menu_link\"]");
    private final By b = By.cssSelector("[href=\"http://rozetka.com.ua/notebooks/c80004/\"][name=\"fat_menu_link\"]");
    private final By c = By.cssSelector("[href=\"http://rozetka.com.ua/notebooks/c80004/filter/\"][name=\"fat_menu_link\"]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCat() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(a);
        action.moveToElement(we).build().perform();

        Thread.sleep(2000);

        WebElement wee = driver.findElement(b);
        action.moveToElement(wee).build().perform();

        Thread.sleep(2000);

        WebElement weee = driver.findElement(c);
        action.moveToElement(weee).click().build().perform();

        Thread.sleep(2000);

    }
}
