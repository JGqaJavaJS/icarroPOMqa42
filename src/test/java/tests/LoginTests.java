package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void positiveLoginTest() {
        splashScreen.pause(15000);
        searchScreen.openMenu();
        searchScreen.clickFirstOnMenu();
        loginScreen.fillLoginForm(user); // fill email, password, click yalla
        searchScreen.openMenu();
        String textMenuSecond = searchScreen.getTextMenuSecond();
        Assert.assertEquals(textMenuSecond, "Logout");
    }
}
