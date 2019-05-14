package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/8
 */

public class RegisterPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id ="com.example.lx.solarfragment:id/newregister")
    WebElement btn_newreg;
    @FindBy(id="com.example.lx.solarfragment:id/username")
    WebElement txt_username;
    @FindBy(id="com.example.lx.solarfragment:id/phone")
    WebElement txt_phone;
    @FindBy(id="com.example.lx.solarfragment:id/email")
    WebElement txt_email;
    @FindBy(id = "com.example.lx.solarfragment:id/password")
    WebElement txt_password;
    @FindBy(id="com.example.lx.solarfragment:id/qpassword")
    WebElement txt_qpassword;
    @FindBy(id = "com.example.lx.solarfragment:id/register")
    WebElement btn_reg;

    public RegisterPage(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
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
