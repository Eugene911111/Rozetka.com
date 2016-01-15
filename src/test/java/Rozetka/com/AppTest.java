package Rozetka.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
    private FirefoxDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private StaffPage staffPage;
    private VideoPage videoPage;

    @Before
    public void precondition() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        staffPage = new StaffPage(driver);
        videoPage = new VideoPage(driver);
    }

    @org.junit.Test
    public void ourFirstTest() throws InterruptedException {
        driver.manage().window().maximize();
        homePage.openHomePage();
        searchPage.openCat();
        staffPage.openVid();
        videoPage.searchSomeText();
    }

    @After
    public void testShutDown() {
        driver.close();
    }

}