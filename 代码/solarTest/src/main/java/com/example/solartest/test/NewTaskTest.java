package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.TaskPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.android.AndroidKeyCode.KEYCODE_BACK;


/**
 * Created by 王东慧 on 2019/5/8
 * 新建任务
 */
public class NewTaskTest extends BaseTest {
    @BeforeClass
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }
    @Test
    public void newTaskSuccess(){
        TaskPage newtask = new TaskPage(getDriver());
        newtask.newTask("喂兔子","10");
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    @Test
    public void newTaskFail(){
        TaskPage taskPage = new TaskPage(getDriver());
        taskPage.newTask("喂兔子","");
        Assert.assertEquals(".AddTaskActivity",getDriver().currentActivity());
        //点击系统返回键
        getDriver().findElementById("com.example.lx.solarfragment:id/back").click();


    }
}
