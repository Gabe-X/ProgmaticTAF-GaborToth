package dummy;

import core.DriverManager;
import org.testng.annotations.Test;

public class GoogleTest extends DriverManager {

    @Test(enabled = false)
    public void doGoogleSearchTest() {
        driver.get("https://www.google.com/");
    }
}
