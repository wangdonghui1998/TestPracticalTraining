package com.example.wdh.uiautomator.utils;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class UIActions {
    public UiDevice device;

    public UIActions(UiDevice device){
        this.device = device;
    }

    public void click(String id) {
        UiObject uiObject = device.findObject(new UiSelector().resourceId(id));
        try {
            uiObject.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void click(UiObject uiObject) {
        try {
            uiObject.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void clickBack(){
        device.pressBack();
    }

    public void type(String id,String text) {
        UiObject uiObject = device.findObject(new UiSelector().resourceId(id));
        try {
            uiObject.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

}
