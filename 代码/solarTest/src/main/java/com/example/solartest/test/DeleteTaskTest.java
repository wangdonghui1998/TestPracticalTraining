package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.DeleteTaskPage;
import com.example.solartest.pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by 王东慧 on 2019/5/14
 */
public class DeleteTaskTest extends BaseTest {
    @BeforeTest
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jiaxinrui","000000");
    }

    @Test
    public void delete(){
        DeleteTaskPage del = new DeleteTaskPage(getDriver());
        del.deleteTask(1);
    }
}
