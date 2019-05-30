package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/28
 */
public class MorePage {
    AndroidDriver driver;
    Actions action;

    @FindBy(id = "com.example.lx.solarfragment:id/ll_set_up")
    WebElement btn_set_up;
    @FindBy(id = "com.example.lx.solarfragment:id/ll_check_out")
    WebElement btn_check_out;
    @FindBy(id = "com.example.lx.solarfragment:id/ll_change_user")
    WebElement btn_change_user;

    public MorePage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }


    public void click(String name){
        switch (name){
            case "设置":
                action.click(btn_set_up);
                break;
            case "退出":
                action.click(btn_check_out);
                break;
            case "切换账号":
                action.click(btn_change_user);
                break;
        }
    }

}
