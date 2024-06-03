package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SplashScreenTests extends BaseTest{

    @Test
    public void versionTextTest() {
        String version = splashScreen.getTextVersion();
        Assert.assertEquals(version, "Version 1.0.0");
    }
}
