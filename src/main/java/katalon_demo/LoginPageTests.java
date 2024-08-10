package katalon_demo;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTests extends DriverManager {

    @Test(groups = {"debugging"}, description = "Checking if getting an error message with wrong inputs")
    public void fillLogin() {
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        LoginPage loginInput = new LoginPage(driver);
        loginInput.fillName("Gabe The Almighty");
        loginInput.fillPassword("42pr0");
        loginInput.pressLogin();
        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]"));
        Assert.assertTrue(errorMsg.isDisplayed(), "Login failed!");


    }



}
