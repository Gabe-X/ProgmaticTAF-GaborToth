package katalon_demo;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverManager {


    @Test(groups = {"appointment"}, description = "Checking if sending a book request is working")
    public static void MakeAppointment() {

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.fillName("John Doe");
        profilPage.fillPassword("ThisIsNotAPassword");
        profilPage.pressLogin();

        AppointmentPage appointmentPage = new AppointmentPage(driver);
        appointmentPage.applyReadmissionBox();
        appointmentPage.fillVisitDate("10/8/2024");
        appointmentPage.BookAppointment();
        System.out.println("Asserting if booking works");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
    }
}
