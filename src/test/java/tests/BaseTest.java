package tests;

import config.AppiumConfig;
import dto.UserDTO;
import pages.SplashScreen;

public class BaseTest extends AppiumConfig {

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();

    SplashScreen splashScreen = new SplashScreen();
}
