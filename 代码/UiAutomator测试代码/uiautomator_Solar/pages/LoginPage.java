package com.example.wdh.uiautomator.pages;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import com.example.wdh.uiautomator.utils.GetCurrentActivity;
import com.example.wdh.uiautomator.utils.UIActions;

import java.io.IOException;

/**
 * Created by 王东慧 on 2019/5/30
 */
public class LoginPage {
    public UiDevice device;
    public UIActions action;

    String txt_name =   "com.example.lx.solarfragment:id/login_name";
    String txt_password = "com.example.lx.solarfragment:id/password";
    String btn_login = "com.example.lx.solarfragment:id/login";

    public LoginPage(UiDevice device){

        this.device = device;
        action = new UIActions(device);
    }

    public void login(String name,String password){
        action.type(txt_name,name);
        action.type(txt_password,password);
        action.click(btn_login);
    }



}
