package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected MobileElement findElement(By by) {
        return (MobileElement) AppiumConfig.getDriver().findElement(by);
    }

    protected List<MobileElement> findElements(By by) {
        return AppiumConfig.getDriver().findElements(by);
    }

    protected String getText(By by) {
        return findElement(by).getText();
    }

    protected void wait(By by, int time) {
        new WebDriverWait(AppiumConfig.getDriver(), time)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void click(By by) {
        findElement(by).click();
    }

    protected void sendText(By by, String text) {
        MobileElement element = findElement(by);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
}
