package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import java.util.List;

public class MyCarsScreen extends BasePage{

    By btnAddNewCar = By.xpath();
    By allSerNumbers = By.xpath();
    public void clickAddNewCar() {
        wait(btnAddNewCar, 5);
        click(btnAddNewCar);
    }

    public boolean verifyBySerNumberCarDisplays(String serNumber) {
        wait(allSerNumbers, 10);
        List<MobileElement> list = findElements(allSerNumbers);
        if(list.isEmpty()) {
            return false;
        } else {
            for(MobileElement element : list) {
                if(element.getText().equals(serNumber)) {
                    System.out.println("ser number found: " + serNumber);
                    return true;
                }
            }
        }
        return false;
    }
}
