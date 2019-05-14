package com.example.solartest.base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
    AndroidDriver<WebElement> driver;

    public AndroidDriver<WebElement> getDriver(){
        return this.driver;
    }
    @BeforeSuite
    public void startApp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/app");
        File app = new File(appDir.getCanonicalPath(), BaseInterface.appName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("appPackage", BaseInterface.appPackage);
        capabilities.setCapability("appActivity",  BaseInterface.appActivity);
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("resetKeyboard", "true");
        driver = new AndroidDriver<WebElement>(new URL(BaseInterface.Baseurl),capabilities);
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

