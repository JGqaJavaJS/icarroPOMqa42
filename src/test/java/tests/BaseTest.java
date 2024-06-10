package tests;

import config.AppiumConfig;
import dto.UserDTO;
import pages.*;

public class BaseTest extends AppiumConfig {

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();

    SplashScreen splashScreen = new SplashScreen();
    SearchScreen searchScreen = new SearchScreen();
    LoginScreen loginScreen = new LoginScreen();
    MyCarsScreen myCarsScreen = new MyCarsScreen();
    AddNewCarScreen addNewCarScreen = new AddNewCarScreen();
}
