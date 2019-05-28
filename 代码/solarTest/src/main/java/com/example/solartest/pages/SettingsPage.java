package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/15
 * 设置页面
 */
public class SettingsPage {
    AndroidDriver driver;
    Actions action;
    IndexPage index;

   @FindBy(id = "com.example.lx.solarfragment:id/sing1")
   WebElement btn_sing;
   @FindBy(id = "android:id/button3")
   WebElement btn_zhd;


    public SettingsPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        index = new IndexPage(driver);
    }

    public void settings(){
        index.click("setting");
        action.click(btn_sing);
        action.click(btn_zhd);
    }

}
