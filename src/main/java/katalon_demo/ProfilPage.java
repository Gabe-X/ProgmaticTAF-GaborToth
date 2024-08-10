package katalon_demo;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilPage extends DriverManager {
    private final By nameInputBy = By.id("txt-username");
    private final By pwInputBy = By.id("txt-password");
    private final By loginButtonBy = By.id("btn-login");

    private final WebDriver driver;

    public ProfilPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillName(String name) {
        WebElement nameInput = driver.findElement(nameInputBy);
        nameInput.sendKeys(name);
    }

    public void fillPassword(String pw) {
        WebElement nameInput = driver.findElement(pwInputBy);
        nameInput.sendKeys(pw);
    }

    public void pressLogin() {
        WebElement pressLoginButton = driver.findElement(loginButtonBy);
        pressLoginButton.click();

    }
}
