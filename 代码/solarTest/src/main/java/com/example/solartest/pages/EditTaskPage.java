package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/14
 * 编辑任务页面
 */
public class EditTaskPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id = "com.example.lx.solarfragment:id/tab2")
    WebElement btn_task;
    @FindBy(id = "android:id/button2")
    WebElement btn_edit;
    @FindBy(id="com.example.lx.solarfragment:id/taskname")
    WebElement txt_taskname;
    @FindBy(id="com.example.lx.solarfragment:id/tasktime")
    WebElement txt_tasktime;
    @FindBy(id = "com.example.lx.solarfragment:id/finish")
    WebElement btn_finish;

    public EditTaskPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void editTask(int order,String taskname,String tasktime){
        //点击任务按钮
        action.click(btn_task);
        //选择一个任务
        List<WebElement> e = driver.findElementById("com.example.lx.solarfragment:id/lv_tasks").
                findElements(By.className("android.widget.LinearLayout"));
        WebElement ele =  e.get(order);
        action.click(ele);
        //点击编辑
        action.click(btn_edit);
        //断言是否进入编辑界面
        Assert.assertEquals(driver.currentActivity(),".UpdateTaskActivity");
        action.type(txt_taskname,taskname);
        action.type(txt_tasktime,tasktime);
        action.click(btn_finish);
        //断言是否进入task列表界面
        Assert.assertEquals(driver.currentActivity(),".MainActivity");
    }

}
