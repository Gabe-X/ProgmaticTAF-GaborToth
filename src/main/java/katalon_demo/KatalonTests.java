package katalon_demo;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonTests extends DriverManager {

    private static final By makeAppointmentButtonBy = By.id("btn-make-appointment");

    @Test(priority = 1, alwaysRun = true)
    public static void HomePage () throws InterruptedException {

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointmentButton = driver.findElement(makeAppointmentButtonBy);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(makeAppointmentButton));
        makeAppointmentButton.click();
        Thread.sleep(500);
    }
}
