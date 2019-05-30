package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.TaskPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by 王东慧 on 2019/5/14
 * 删除
 */
public class DeleteTaskTest extends BaseTest {
    @BeforeClass
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void delete(){
        TaskPage taskPage = new TaskPage(getDriver());
        taskPage.deleteTask(1);
        //由于软件自身不能实现该功能，因此测试会报错
    }
}
