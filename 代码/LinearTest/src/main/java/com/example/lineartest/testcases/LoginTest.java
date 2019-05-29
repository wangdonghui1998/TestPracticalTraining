package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.prefs.BackingStoreException;

/**
 * Created by 王东慧 on 2019/5/14
 * 登录
 */
public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }

    @Test
    public void loginFail(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123");
        Assert.assertEquals(getDriver().currentActivity(),".register.LoginActivity");
        //返回原始登录界面
        getDriver().findElementById("me.tictok.linear:id/back").click();
    }
}
