package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.NewTaskPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/8
 * 新建任务
 */
public class NewTaskTest extends BaseTest {
    @BeforeTest
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }
    @Test
    public void newTaskSuccess(){
        NewTaskPage newtask = new NewTaskPage(getDriver());
        newtask.newTask("喂兔子","10");
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    @Test
    public void newTaskFail(){
        NewTaskPage newtask = new NewTaskPage(getDriver());
        newtask.newTask("喂兔子","");
        Assert.assertEquals(".AddTaskActivity",getDriver().currentActivity());
    }
}
