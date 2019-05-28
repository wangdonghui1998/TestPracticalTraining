package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.LoginPage;
import com.example.lineartest.pages.StartClassPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/15
 * 开启课程
 */
public class StartClassTest extends BaseTest {
    @BeforeTest
    public void login(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
    }

    @Test
    public void start(){
        StartClassPage start = new StartClassPage(getDriver());
        start.startclass();
        Assert.assertEquals(getDriver().currentActivity(),".sport.CourseActivity");
    }
}
