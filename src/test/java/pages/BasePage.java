package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    protected String getTextByIndex(By by, int index) {
//        List<MobileElement> list = findElements(by);
//        MobileElement element = list.get(index);
//        return element.getText();
        return findElements(by)
                .get(index)
                .getText();
    }

    protected void wait(By by, int time) {
        new WebDriverWait(AppiumConfig.getDriver(), time)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void click(By by) {
        // logger info .....
        findElement(by).click();
    }

    protected void sendText(By by, String text) {
        MobileElement element = findElement(by);
        element.click();
        element.clear();
        element.sendKeys(text);
        hideKeyBoard();
    }

    public void hideKeyBoard() {
        AppiumConfig.getDriver().hideKeyboard();
    }

    public void clickBackBtn() {
        AppiumConfig.getDriver().navigate().back();
    }

    protected void clickByIndex(By by, int index) {
        List<MobileElement> list = findElements(by);
        WebElement element = list.get(index);
        element.click();
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
