package pages;

import dto.CarDTO;
import org.openqa.selenium.By;

public class AddNewCarScreen extends BasePage{

    By inputSerNumber = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editSerial']");
    By inputManufacture = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editMan']");
    By inputModel = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editModel']");
    By inputCity = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editCity']");
    By inputPrice = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editPrice']");
    By inputCarClass = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editCarClass']");
    By inputFuelType = By.xpath("//*[@resource-id='com.telran.ilcarro:id/text1']");
    By inputFuelGas = By.xpath("//*[@text='Gas']");
    //String fueltype = "";
    //By inputFuelTypeFuel = By.xpath("//*[@text='"+fueltype+"']");
    public By getLocatorFuelType(String fuel) {
        return By.xpath("//*[@text='"+fuel+"']");
    }
    By inputYear = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editYear']");
    By inputSeats = By.xpath("//*[@resource-id='com.telran.ilcarro:id/editSeats']");
    By btnAddNewCar = By.xpath("//*[@resource-id='com.telran.ilcarro:id/addCarBtn']");

    public void addNewCar(CarDTO carLocal) {
        wait(inputSerNumber, 5);
        fillSerialNumber(carLocal.getSerNumber());
        fillManufacture(carLocal.getManufacture());
        fillModel(carLocal.getModel());
        fillCity(carLocal.getCity());
        fillPrice(carLocal.getPrice());
        fillCarClass(carLocal.getCarClass());
        // scroll to element button add car
        clickFuelType();
        //fueltype = carLocal.getFuelType();
        //System.out.println(inputFuelTypeFuel.toString());
        click(getLocatorFuelType(carLocal.getFuelType()));
        System.out.println(getLocatorFuelType(carLocal.getFuelType()).toString());
      //  clickFuelGas();
       // fillFuel(carLocal.getFuelType());
        fillYear(carLocal.getYear());
        fillSeatsCount(carLocal.getSeats());
        clickAddNewCar();
    }

    public void clickFuelGas() {
        click(inputFuelGas);
    }

    public void clickFuelType() {
        click(inputFuelType);
    }

    public void clickAddNewCar() {
        click(btnAddNewCar);
    }

    public void fillSeatsCount(int seats) {
        sendText(inputSeats, String.valueOf(seats));
    }

    public void fillYear(int year) {
        sendText(inputYear, String.valueOf(year));
    }

    public void fillFuel(String fuelType) {
        sendText(inputFuelGas, fuelType);
    }

    public void fillCarClass(String carClass) {
        sendText(inputCarClass, carClass);
    }

    public void fillPrice(int price) {
        sendText(inputPrice, String.valueOf(price));
    }

    public void fillCity(String city) {
        sendText(inputCity, city);
    }

    public void fillModel(String model) {
        sendText(inputModel, model);
    }

    public void fillManufacture(String manufacture) {
        sendText(inputManufacture, manufacture);
    }

    public void fillSerialNumber(String serNumber) {
        sendText(inputSerNumber, serNumber);
    }
}

/*
    public void tapWithCoordinates(int x, int y) {
            new TouchAction((PerformsTouchActions) driver).tap(PointOption.point(x,y))
                            .release().perform();
                             }
 */

