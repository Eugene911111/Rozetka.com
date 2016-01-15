package Rozetka.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StaffPage {
    private WebDriver driver;
    private final By searchButton = By.cssSelector("[src=\"http://i2.rozetka.ua/goods/1383409/copy_lenovo_80r20068ua_5645ce21e8e42_images_1383409917.jpg\"]");
    private final By searchVideoButton = By.cssSelector("[href=\"http://rozetka.com.ua/lenovo_80r2006aua/p5905797/#full_review\"]");

    public StaffPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openVid() throws InterruptedException {
        Actions action = new Actions(driver);

        WebElement wa = driver.findElement(searchButton);
        action.moveToElement(wa).build().perform();

        Thread.sleep(2000);

        WebElement waa = driver.findElement(searchVideoButton);
        action.moveToElement(waa).click().build().perform();

    }
}