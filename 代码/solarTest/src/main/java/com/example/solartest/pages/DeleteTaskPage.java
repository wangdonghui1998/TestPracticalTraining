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
 */
public class DeleteTaskPage {
    AndroidDriver driver;
    Actions action;
    @FindBy(id = "com.example.lx.solarfragment:id/tab2")
    WebElement btn_task;
    @FindBy(id = "android:id/button1")
    WebElement btn_del;
    @FindBy(id = "android:id/button1")
    WebElement btn_del_sub;


    public DeleteTaskPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void deleteTask(int order){
        //点击任务按钮
        action.click(btn_task);
        //选择一个任务
        List<WebElement> e = driver.findElementById("com.example.lx.solarfragment:id/lv_tasks").
                findElements(By.className("android.widget.LinearLayout"));
        WebElement ele =  e.get(order);
        //获取删除前的任务个数
        int size1 = e.size();
        //删除任务
        action.click(ele);
        action.click(btn_del);
        action.click(btn_del_sub);
        //获取删除后的任务个数
        List<WebElement> e2 = driver.findElementById("com.example.lx.solarfragment:id/lv_tasks").
                findElements(By.className("android.widget.LinearLayout"));
        int size2 = e2.size();

        //根据任务个数进行断言
        Assert.assertEquals(size2,size1-1);

    }

}
