package com.example.wdh.uiautomator.testcase;

import com.example.wdh.uiautomator.base.BaseTest;
import com.example.wdh.uiautomator.pages.LoginPage;
import com.example.wdh.uiautomator.pages.MorePage;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by 王东慧 on 2019/6/5
 */
public class SettingsTest extends BaseTest {
    @Before
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDevice());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void settings(){
        MorePage morePage = new MorePage(getDevice());
        morePage.settings();
    }
}
