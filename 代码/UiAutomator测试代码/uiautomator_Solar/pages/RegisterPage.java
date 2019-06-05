package com.example.wdh.uiautomator.pages;

import android.support.test.uiautomator.UiDevice;

import com.example.wdh.uiautomator.utils.UIActions;

/**
 * Created by 王东慧 on 2019/6/5
 */
public class RegisterPage {
    public UiDevice device;
    public UIActions action;
    String btn_newreg = "com.example.lx.solarfragment:id/newregister";
    String txt_username = "com.example.lx.solarfragment:id/username";
    String txt_phone = "com.example.lx.solarfragment:id/phone";
    String txt_email = "com.example.lx.solarfragment:id/email";
    String txt_password = "com.example.lx.solarfragment:id/password";
    String txt_qpassword = "com.example.lx.solarfragment:id/qpassword";
    String btn_reg = "com.example.lx.solarfragment:id/register";

    public RegisterPage(UiDevice device){
        this.device = device;
        action = new UIActions(device);
    }

    public void register(String username,String phone,String email,String password,String qpassword){
        //点击注册新用户按钮
        action.click(btn_newreg);
        //输入注册信息
        action.type(txt_username,username);
        action.type(txt_phone,phone);
        action.type(txt_email,email);
        action.type(txt_password,password);
        action.type(txt_qpassword,qpassword);
        //点击注册按钮
        action.click(btn_reg);
    }

}
