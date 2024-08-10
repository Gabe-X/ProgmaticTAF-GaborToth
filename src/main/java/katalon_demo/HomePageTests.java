package katalon_demo;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends DriverManager {

    @Test
    public void AppointmentButtonClickable() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        HomePage homePage = new HomePage(driver);
        homePage.findMakeAppointmentButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

    }

}
