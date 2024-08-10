package katalon_demo;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverManager {

    @Test
    public void loadProfilePage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#profile");

        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.fillName("John Doe");
        profilPage.fillPassword("ThisIsNotAPassword");
        profilPage.pressLogin();
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#profile");


    }
}
