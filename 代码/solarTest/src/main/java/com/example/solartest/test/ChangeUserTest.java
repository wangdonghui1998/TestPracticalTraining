package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.ChangeUserPage;
import com.example.solartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/28
 */
public class ChangeUserTest extends BaseTest {
    @BeforeTest
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void changeuser(){
        ChangeUserPage change = new ChangeUserPage(getDriver());
        change.change("lisi","123456");
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }
}
