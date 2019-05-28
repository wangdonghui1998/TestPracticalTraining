package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBySet;

/**
 * Created by 王东慧 on 2019/5/15
 */
public class LogoutPage {
    AndroidDriver driver;
    Actions action;
    IndexPage index;

    @FindBy(id = "me.tictok.linear:id/settings")
    WebElement btn_settings;
    @FindBy(id = "me.tictok.linear:id/logout")
    WebElement btn_logout;

    public LogoutPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);//与FindBy结合使用
        action = new Actions(driver);
        index = new IndexPage(driver);
    }

    public void logout(){
        index.click_index("我的");
        action.click(btn_settings);
        action.click(btn_logout);
    }

}
