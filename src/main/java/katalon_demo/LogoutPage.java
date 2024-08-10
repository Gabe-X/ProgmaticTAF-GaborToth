package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    private final WebDriver driver;
    private final By menuDropDownBy = By.id("menu-toggle");
    private final By logoutBy = By.linkText("Logout");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDropDownMenu (){
        WebElement clickDropDownMenu = driver.findElement(menuDropDownBy);
        System.out.println("Opening dropdown menu");
        clickDropDownMenu.click();
    }

    public void logout(){
        WebElement pressLogout = driver.findElement(logoutBy);
        System.out.println("Logging out of webpage");
        pressLogout.click();
    }
}

