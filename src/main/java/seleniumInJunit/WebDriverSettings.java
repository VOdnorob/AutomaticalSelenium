package seleniumInJunit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:/Testing/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void close(){
        driver.quit();
    }
}
