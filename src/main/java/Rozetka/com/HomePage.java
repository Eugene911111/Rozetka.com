package Rozetka.com;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage openHomePage() {
        driver.get("http://www.rozetka.com.ua/");
        return this;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

}


