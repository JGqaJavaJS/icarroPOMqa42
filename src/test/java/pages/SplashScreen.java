package pages;

import org.openqa.selenium.By;

public class SplashScreen extends BasePage {
    By textVersion =
            By.xpath("//*[@resource-id='com.telran.ilcarro:id/versionText']");

    public String getTextVersion() {
        return getText(textVersion);
    }
}
