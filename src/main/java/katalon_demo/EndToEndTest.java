package katalon_demo;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends DriverManager {

    @Test(groups = {"regression"}, description = "Running full test from login to booking, then logout")
    public void endToEndTest() throws InterruptedException {

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        HomePage homePage = new HomePage(driver);
        ProfilPage profilPage = new ProfilPage(driver);
        AppointmentPage appointmentPage = new AppointmentPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);


        homePage.clickMakeAppointmentButton();
        profilPage.fillName("John Doe");
        profilPage.fillPassword("ThisIsNotAPassword");
        profilPage.pressLogin();
        appointmentPage.applyReadmissionBox();
        appointmentPage.fillVisitDate("10/8/2024");
        appointmentPage.BookAppointment();
        logoutPage.openDropDownMenu();
        Thread.sleep(500);
        logoutPage.logout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

    }
}
