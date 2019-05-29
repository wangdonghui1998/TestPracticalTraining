package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.LoginPage;
import com.example.lineartest.pages.MyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.PointOption.point;


/**
 * Created by 王东慧 on 2019/5/29
 */
public class FavoriteTest extends BaseTest {
    @BeforeClass
    public void login(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
    }

    @Test
    public void delfavorite(){
        MyPage myPage = new MyPage(getDriver());
        int fromPoint_x=1433;
        int fromPoint_y=383;
        int toPoint_x=777;
        int toPoint_y=373;
        myPage.del_myFavorite(fromPoint_x,fromPoint_y ,toPoint_x,toPoint_y);
    }
}
