package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/14
 */
public class LoginPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id = "me.tictok.linear:id/btnLogIn")
    WebElement btn_login;
    @FindBy(id = "me.tictok.linear:id/etUser")
    WebElement txt_user;
    @FindBy(id = "me.tictok.linear:id/etPassword")
    WebElement txt_password;
    @FindBy(id = "me.tictok.linear:id/btnLogin")
    WebElement btn_login_sub;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);//与FindBy结合使用
        action = new Actions(driver);
    }

    public void login(String username,String password){
        action.click(btn_login);
        action.type(txt_user,username);
        action.type(txt_password,password);
        action.click(btn_login_sub);
    }

}
