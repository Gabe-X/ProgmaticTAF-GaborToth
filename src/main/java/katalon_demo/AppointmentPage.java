package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentPage {

    private static final By bookAppointmentButtonBy = By.id("btn-book-appointment");
    private final By tickBoxApply = By.id("chk_hospotal_readmission");
    private final WebDriver driver;
    private final By visitDateBy = By.id("txt_visit_date");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyReadmissionBox(){
        WebElement applyBox = driver.findElement(tickBoxApply);
        System.out.println("Filling hospital Readmission box");
        applyBox.click();

    }

    public void fillVisitDate(String visitDate) {
        WebElement fillVisitDate = driver.findElement(visitDateBy);
        System.out.println("Picking a date for the visist");
        fillVisitDate.sendKeys(visitDate);
    }

    public void BookAppointment(){
        WebElement pressBookAppointmentButton = driver.findElement(bookAppointmentButtonBy);
        System.out.println("Booking Appointment by pressing the 'Book Appointment' button");
        pressBookAppointmentButton.click();
    }

}
