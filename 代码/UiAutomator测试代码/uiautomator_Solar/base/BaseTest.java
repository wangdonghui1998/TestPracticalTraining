package com.example.wdh.uiautomator.base;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;


/**
 * Created by 王东慧 on 2019/5/30
 */
public class BaseTest {
   static private UiDevice device;

    @BeforeClass
    public static void startup() throws RemoteException, UiObjectNotFoundException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        //判断是是否是点亮的
        if (!device.isScreenOn()) {
            device.wakeUp();
        }
        UiObject start = device.findObject(new UiSelector().text("Solar"));
        start.click();
    }

    @AfterClass
    public static void quit(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            device.executeShellCommand("am force-stop com.example.lx.solarfragment");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UiDevice getDevice(){
        return this.device;
    }


}
