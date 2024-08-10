package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentPage {

    private static final By makeAppointmentButtonBy = By.id("btn-make-appointment");
    private final WebDriver driver;

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointment() {

        WebElement makeAppointmentButton = driver.findElement(makeAppointmentButtonBy);
        makeAppointmentButton.click();

    }


}
