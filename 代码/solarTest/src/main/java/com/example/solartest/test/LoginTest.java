package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.dataprovider.NSDataProvider;
import com.example.solartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by 王东慧 on 2019/5/8
 */
public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess() throws InterruptedException {
        LoginPage loginsuccess = new LoginPage(getDriver());
        loginsuccess.login("jiaxinrui","000000");
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

    @Test
    public void loginFail() throws InterruptedException {
        LoginPage loginsuccess = new LoginPage(getDriver());
        loginsuccess.login("jiaxinrui","000");
        Assert.assertEquals(".LoginActivity",getDriver().currentActivity());
    }
}
