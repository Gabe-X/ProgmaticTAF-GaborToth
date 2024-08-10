package katalon_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final By nameInputBy = By.id("txt-username");
    private final By pwInputBy = By.id("txt-password");
    private final By loginButtonBy = By.id("btn-login");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillName(String name) {
        WebElement nameInput = driver.findElement(nameInputBy);
        System.out.println("Fill out name field");
        nameInput.sendKeys(name);
    }

    public void fillPassword(String pw) {
        WebElement nameInput = driver.findElement(pwInputBy);
        System.out.println("Fill out password field");
        nameInput.sendKeys(pw);
    }

    public void pressLogin() {
        WebElement pressLoginButton = driver.findElement(loginButtonBy);
        System.out.println("Click login button");
        pressLoginButton.click();

    }
}
