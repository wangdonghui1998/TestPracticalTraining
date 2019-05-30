package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/28
 */
public class IndexPage {
    AndroidDriver driver;
    Actions action;

    @FindBy(id = "com.example.lx.solarfragment:id/tab2")
    WebElement btn_task;
    @FindBy(id = "com.example.lx.solarfragment:id/btn_more")
    WebElement btn_more;

    public IndexPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void click(String name){
        switch (name){
            case "任务":
                action.click(btn_task);
                break;
            case "more":
                action.click(btn_more);
                break;
        }
    }
}
