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
 * Created by 王东慧 on 2019/5/28
 * 任务页面
 */
public class TaskPage {
    AndroidDriver driver;
    Actions action;
    IndexPage indexPage;
    //deleteTask
    @FindBy(id = "android:id/button1")
    WebElement btn_del;
    @FindBy(id = "android:id/button1")
    WebElement btn_del_sub;
    //editTask
    @FindBy(id = "android:id/button2")
    WebElement btn_edit;
    @FindBy(id="com.example.lx.solarfragment:id/taskname")
    WebElement txt_taskname;
    @FindBy(id="com.example.lx.solarfragment:id/tasktime")
    WebElement txt_tasktime;
    @FindBy(id = "com.example.lx.solarfragment:id/finish")
    WebElement btn_finish;
    //newTask
    @FindBy(id="com.example.lx.solarfragment:id/jiahao")
    WebElement btn_add;
    //startTask
    @FindBy(id = "android:id/button3")
    WebElement btn_start;

    public TaskPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        indexPage = new IndexPage(driver);
        //点击任务按钮
        indexPage.click("任务");
    }


    public void deleteTask(int order){
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

    public void editTask(int order,String taskname,String tasktime){
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

    public void newTask(String taskname,String tasktime){
        //点击加号
        action.click(btn_add);
        //添加任务名称和任务时间
        action.type(txt_taskname,taskname);
        action.type(txt_tasktime,tasktime);
        //点击finish按钮
        action.click(btn_finish);
    }

    public void startTask(int order){
        //选择一个任务
        List<WebElement> e = driver.findElementById("com.example.lx.solarfragment:id/lv_tasks").
                findElements(By.className("android.widget.LinearLayout"));
        WebElement ele =  e.get(order);
        //启动一个任务
        action.click(ele);
        action.click(btn_start);
    }



}
