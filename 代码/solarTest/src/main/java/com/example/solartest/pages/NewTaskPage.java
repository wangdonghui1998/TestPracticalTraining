package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/8
 */
public class NewTaskPage {
    Actions action;
    AndroidDriver driver;
    @FindBy(id = "com.example.lx.solarfragment:id/tab2")
    WebElement btn_task;
    @FindBy(id="com.example.lx.solarfragment:id/jiahao")
    WebElement btn_add;
    @FindBy(id="com.example.lx.solarfragment:id/taskname")
    WebElement txt_taskname;
    @FindBy(id="com.example.lx.solarfragment:id/tasktime")
    WebElement txt_tasktime;
    @FindBy(id = "com.example.lx.solarfragment:id/finish")
    WebElement btn_finish;

    public NewTaskPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void newTask(String taskname,String tasktime){
        //点击任务按钮
        action.click(btn_task);
        //点击加号
        action.click(btn_add);
        //添加任务名称和任务时间
        action.type(txt_taskname,taskname);
        action.type(txt_tasktime,tasktime);
        //点击finish按钮
        action.click(btn_finish);
    }
}
