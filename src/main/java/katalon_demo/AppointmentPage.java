package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentPage {

    private static final By makeAppointmentButtonBy = By.id("btn-make-appointment");
    private final By tickBoxApply = By.id("chk_hospotal_readmission");
    private final WebDriver driver;
    private final By visitDateBy = By.id("txt_visit_date");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    private void applyReadmissionBox() throws InterruptedException {
        WebElement applyBox = driver.findElement(tickBoxApply);
        applyBox.click();
        Thread.sleep(1000);
    }

    public void fillVisitDate(String visitDate) {
        WebElement fillVisitDate = driver.findElement(visitDateBy);
        fillVisitDate.sendKeys(visitDate);
    }


}
