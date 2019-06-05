package com.example.wdh.uiautomator.pages;

import android.support.test.uiautomator.UiDevice;

import com.example.wdh.uiautomator.utils.UIActions;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class IndexPage {
    public UiDevice device;
    public UIActions action;

    String btn_more = "com.example.lx.solarfragment:id/btn_more";
    String btn_task = "com.example.lx.solarfragment:id/tab2";

    public IndexPage(UiDevice device){

        this.device = device;
        action = new UIActions(device);
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
