package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    private final WebDriver driver;
    private final By menuDropDownBy = By.className("fa fa-bars");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDropDownMenu (){
        WebElement clickDropDownMenu = driver.findElement(menuDropDownBy);
        clickDropDownMenu.click();
    }
}

