package pages;

import dto.CarDTO;
import org.openqa.selenium.By;

public class AddNewCarScreen extends BasePage{

    By inputSerNumber = By.xpath();
    By inputManufacture = By.xpath();
    By inputModel = By.xpath();
    By inputCity = By.xpath();
    By inputPrice = By.xpath();
    By inputCarClass = By.xpath();
    By inputFuelGas = By.xpath();
    By inputYear = By.xpath();
    By inputSeats = By.xpath();
    By btnAddNewCar = By.xpath();

    public void addNewCar(CarDTO carLocal) {
        wait(inputSerNumber, 5);
        fillSerialNumber(carLocal.getSerNumber());
        fillManufacture(carLocal.getManufacture());
        fillModel(carLocal.getModel());
        fillCity(carLocal.getCity());
        fillPrice(carLocal.getPrice());
        fillCarClass(carLocal.getCarClass());
        // scroll to element button add car
        fillFuel(carLocal.getFuelType());
        fillYear(carLocal.getYear());
        fillSeatsCount(carLocal.getSeats());
        clickAddNewCar();
        // close pop up?
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
