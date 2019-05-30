package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.LoginPage;
import com.example.lineartest.pages.MyPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/15
 */
public class LogoutTest extends BaseTest {
    @BeforeClass
    public void loginSuccess(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
    }

    @Test
    public void logout(){
        MyPage myPage = new MyPage(getDriver());
        myPage.logout();
        Assert.assertEquals(getDriver().currentActivity(),".me.SettingsActivity");
    }
}
