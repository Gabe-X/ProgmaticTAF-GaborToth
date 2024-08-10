package katalon_demo;

import core.DriverManager;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverManager {

    @Test
    public static void MakeAppointment() {

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        AppointmentPage katalonAppointmentPage = new AppointmentPage(driver);
        katalonAppointmentPage.clickMakeAppointment();


    }
}
