package tests;

import dto.CarDTO;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewCarTests extends BaseTest{

    @BeforeClass
    public void preconditions() {
        searchScreen.openMenu();
        searchScreen.clickFirstOnMenu();
        loginScreen.fillLoginForm(user);
    }

    @Test
    public void addNewCarPositiveTest() {
        Random random = new Random();
        String serNumber = "1234567" + random.nextInt(10000, 99999);
        CarDTO carLocal = CarDTO.builder()
                .serNumber(serNumber)
                .manufacture("opel")
                .model("prius")
                .city("Tel Aviv")
                .price(25)
                .carClass("2")
                .fuelType("Gas")
                .year(2019)
                .seats(2)
                .build();
        searchScreen.openMenu();
        searchScreen.clickFirstOnMenu();
        myCarsScreen.clickAddNewCar();
        addNewCarScreen.addNewCar(carLocal);
        Assert.assertTrue(myCarsScreen.verifyBySerNumberCarDisplays(serNumber));
    }

}
