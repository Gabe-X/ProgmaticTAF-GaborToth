package katalon_demo;

import core.DriverManager;
import org.testng.annotations.Test;

public class HomePageTests extends DriverManager {

    @Test(priority = 1, alwaysRun = true)
    public static void MakeAppointment() {

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        HomePage katalonHomePage = new HomePage(driver);
        katalonHomePage.clickMakeAppointment();

    }
}
