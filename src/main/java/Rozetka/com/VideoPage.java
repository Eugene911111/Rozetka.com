package Rozetka.com;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoPage {
    private WebDriver driver;
    private final By searchText = By.xpath("//h3[contains(., 'Подпишитесь на наш канал!')]");

    public VideoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchSomeText() throws InterruptedException {
        Assert.assertTrue(driver.findElement(searchText).isDisplayed());
    }
}
