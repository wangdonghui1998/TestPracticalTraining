package com.example.wdh.uiautomator.pages;

import android.support.test.uiautomator.UiDevice;

import com.example.wdh.uiautomator.utils.UIActions;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class MorePage {
    public UiDevice device;
    public UIActions action;
    IndexPage indexPage;
    LoginPage loginPage;

    String btn_more = "com.example.lx.solarfragment:id/btn_more";
    String btn_check_out = "com.example.lx.solarfragment:id/ll_check_out";
    String btn_set_up = "com.example.lx.solarfragment:id/ll_set_up";
    String btn_change_user ="com.example.lx.solarfragment:id/ll_change_user";

    //设置
    String btn_sing = "com.example.lx.solarfragment:id/sing1";
    String btn_zhd = "android:id/button3";


    public MorePage(UiDevice device){
        this.device = device;
        action = new UIActions(device);
        indexPage = new IndexPage(device);
        loginPage = new LoginPage(device);
        indexPage.click("more");
    }

    private void click(String name){
        switch (name){
            case "设置":
                action.click(btn_set_up);
                break;
            case "退出":
                action.click(btn_check_out);
                break;
            case "切换账号":
                action.click(btn_change_user);
                break;
        }
    }

    public void change(String name,String password) {
        this.click("切换账号");
        loginPage.login(name, password);
    }

    public void settings(){
        this.click("设置");
        action.click(btn_sing);
        action.click(btn_zhd);
    }

    public void logout(){
        this.click("退出");
    }
}
