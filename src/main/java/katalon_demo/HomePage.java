package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;
    private static final By makeAppointmentButtonBy = By.id("btn-make-appointment");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
        public void clickMakeAppointment(){

        WebElement makeAppointmentButton = driver.findElement(makeAppointmentButtonBy);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(makeAppointmentButton));
        makeAppointmentButton.click();

    }


}
