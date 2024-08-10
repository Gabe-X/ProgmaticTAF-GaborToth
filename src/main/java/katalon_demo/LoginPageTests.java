package katalon_demo;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTests extends DriverManager {

    @Test
    public void fillLogin() throws InterruptedException {
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        LoginPage loginInput = new LoginPage(driver);
        loginInput.fillName("Gabor Toth");
        loginInput.fillPassword("42pr0");
        loginInput.pressLogin();
        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]"));
        Assert.assertTrue(errorMsg.isDisplayed(), "Login failed!");


    }



}
