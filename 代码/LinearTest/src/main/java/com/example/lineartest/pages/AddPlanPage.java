package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/15
 */
public class AddPlanPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id="me.tictok.linear:id/add")
    WebElement btn_add;
    @FindBy(id = "me.tictok.linear:id/plan_image1")
    WebElement btn_img1;
    @FindBy(id = "android:id/button1")
    WebElement btn_sub;

    public AddPlanPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);//与FindBy结合使用
        action = new Actions(driver);
    }

    public void addplan(){
        action.click(btn_add);
        action.click(btn_img1);
        action.click(btn_sub);
    }
}
