package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.TaskPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/9
 * 开启任务
 */
public class StartTaskTest extends BaseTest {
    @BeforeTest
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void startTaskSuccess(){
        TaskPage taskPage = new TaskPage(getDriver());
        taskPage.startTask(2);
        Assert.assertEquals(getDriver().currentActivity(),".StartTimeActivity");
    }

}
