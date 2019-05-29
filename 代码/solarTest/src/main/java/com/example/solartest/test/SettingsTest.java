package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.SettingsPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/15
 * 设置
 */
public class SettingsTest extends BaseTest {
    @BeforeClass
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void settings(){
        SettingsPage set = new SettingsPage(getDriver());
        set.settings();
        Assert.assertEquals(getDriver().currentActivity(),".SettingActivity");
    }

}
