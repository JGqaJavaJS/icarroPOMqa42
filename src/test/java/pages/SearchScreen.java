package pages;

import org.openqa.selenium.By;

public class SearchScreen extends BasePage{

    By btnOpenMenu = By.xpath("//*[@content-desc='More options']");
    By btnsInMenu = By.xpath("//*[@resource-id='com.telran.ilcarro:id/title']");

    public void openMenu() {
        wait(btnOpenMenu, 20);
        click(btnOpenMenu);
    }

    public void clickFirstOnMenu() {
        wait(btnsInMenu, 5);
        clickByIndex(btnsInMenu, 0);
    }

    public String getTextMenuSecond() {
        wait(btnsInMenu, 5);
        return getTextByIndex(btnsInMenu, 1);
    }
}
