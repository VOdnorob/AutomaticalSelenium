package seleniumInJunit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginToStackOverflow extends WebDriverSettings{

    @Test
    public void userLogin(){
        driver.get("index_login_button");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Stack Overflow - Where Developers Learn, Share, & Build Careers");

        driver.findElementByXPath("//div[@class=\"major-provider btn _block _medium ws-nowrap _google\"]").click();
        driver.findElementByXPath("//div[@class=\"vR13fe k6Zj8d SmR8\"]").click();


        System.out.println("Zashlo");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("index_email"))
        );
        driver.findElementById("index_login_button").click();




    }
}
