package pages;

import dto.UserDTO;
import org.openqa.selenium.By;

public class LoginScreen extends BasePage{

    By inputEmail = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editLoginEmail']");
    By inputPassword = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editLoginPassword']");
    By btnYallaLogin = By.xpath("//*[@resource-id='com.telran.ilcarro:id/loginBtn']");
    public void fillLoginForm(UserDTO user) {
        fillEmailInput(user.getUsername());
        fillPasswordInput(user.getPassword());
        clickYallaLogin();
    }

    public void clickYallaLogin() {
        click(btnYallaLogin);
    }

    public void fillPasswordInput(String password) {
        wait(inputPassword, 5);
        sendText(inputPassword, password);
    }

    public void fillEmailInput(String username) {
        wait(inputEmail, 5);
        sendText(inputEmail, username);
    }
}
