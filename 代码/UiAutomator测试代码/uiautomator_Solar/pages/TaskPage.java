package com.example.wdh.uiautomator.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import com.example.wdh.uiautomator.utils.UIActions;

import java.util.List;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class TaskPage {
    public UiDevice device;
    public UIActions action;
    public IndexPage indexPage;

    //deleteTask
    String btn_del = "android:id/button1";
    String btn_del_sub = "android:id/button2";
    //editTask
    String btn_edit = "android:id/button2";
    String txt_taskname ="com.example.lx.solarfragment:id/taskname";
    String txt_tasktime = "com.example.lx.solarfragment:id/tasktime";
    String btn_finish = "com.example.lx.solarfragment:id/finish";
    //newTask
    String btn_add = "com.example.lx.solarfragment:id/jiahao";
    //startTask
    String btn_start =  "android:id/button3";

    public TaskPage(UiDevice device){
        this.device = device;
        action = new UIActions(device);
        indexPage = new IndexPage(device);
        //点击任务按钮
        indexPage.click("任务");
    }

    public void deleteTask(int order){
        UiObject uiObject =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/lv_tasks").
                childSelector(new UiSelector().className("android.widget.LinearLayout").index(order)));

        //删除任务
        action.click(uiObject);
        action.click(btn_del);
        action.click(btn_del_sub);
    }

    public void editTask(int order,String taskname,String tasktime){
        //选择一个任务
        UiObject uiObject =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/lv_tasks").
                childSelector(new UiSelector().className("android.widget.LinearLayout").index(order)));
        action.click(uiObject);
        //点击编辑
        action.click(btn_edit);
        action.type(txt_taskname,taskname);
        action.type(txt_tasktime,tasktime);
        action.click(btn_finish);

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
        UiObject uiObject =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/lv_tasks").
                childSelector(new UiSelector().className("android.widget.LinearLayout").index(order)));
        //启动一个任务
        action.click(uiObject);
        action.click(btn_start);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击返回键
        action.clickBack();

    }
}
