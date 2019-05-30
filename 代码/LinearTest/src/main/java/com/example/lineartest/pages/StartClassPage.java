package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/15
 */
public class StartClassPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(className = "android.widget.ScrollView")
    WebElement scroll;
    @FindBy(id = "me.tictok.linear:id/train1")
    WebElement btn_train1;
    @FindBy(id = "me.tictok.linear:id/begin_course")
    WebElement btn_begin_course;

    public StartClassPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);//与FindBy结合使用
        action = new Actions(driver);
    }

    public void startclass(){
        action.click(btn_train1);
        action.click(btn_begin_course);

    }
}
