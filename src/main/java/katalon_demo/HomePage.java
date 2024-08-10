package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class HomePage {

    private static final By AppointmentButtonBy = By.id("btn-make-appointment");
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointmentButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(AppointmentButtonBy));
        System.out.println("Checking if button 'Make Appointment' is clickable");
        element.click();



    }


}
