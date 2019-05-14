package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.StartTaskPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/9
 */
public class StartTaskTest extends BaseTest {
    @BeforeTest
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void startTaskSuccess(){
        StartTaskPage st = new StartTaskPage(getDriver());
        st.startTask(2);
        Assert.assertEquals(".StartTimeActivity",getDriver().currentActivity());
    }

}
