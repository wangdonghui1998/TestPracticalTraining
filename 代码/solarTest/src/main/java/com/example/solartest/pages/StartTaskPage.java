package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by 王东慧 on 2019/5/8
 */
public class StartTaskPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id = "com.example.lx.solarfragment:id/tab2")
    WebElement btn_task;
    @FindBy(id = "android:id/button3")
    WebElement btn_start;

    public StartTaskPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void startTask(int order){
        //点击任务按钮
        action.click(btn_task);
        //选择一个任务
        List<WebElement> e = driver.findElementById("com.example.lx.solarfragment:id/lv_tasks").
                findElements(By.className("android.widget.LinearLayout"));
        WebElement ele =  e.get(order);
        //启动一个任务
        action.click(ele);
        action.click(btn_start);

    }
}
