package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.FriendPage;
import com.example.lineartest.pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by 王东慧 on 2019/5/28
 * 聊天
 */
public class ChatTest extends BaseTest {
    @BeforeClass
    public void login(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
    }

    @Test
    public void chat(){
        String text = "你好，我是XXX";
        FriendPage ch = new FriendPage(getDriver());
        ch.chat(1,text);

        //断言
        List<WebElement> textviewlist = getDriver().findElementsById("me.tictok.linear:id/right_msg");
        String actual = textviewlist.get(1).getText();
        Assert.assertEquals(actual,text);
    }

}
