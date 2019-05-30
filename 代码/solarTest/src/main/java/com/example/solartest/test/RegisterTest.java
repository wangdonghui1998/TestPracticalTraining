package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Created by 王东慧 on 2019/5/8
 * 注册
 */

public class RegisterTest extends BaseTest {
    @Test
    public void registerSuccess(){
        RegisterPage reg=new RegisterPage(getDriver());
        reg.register("test1","15200000000",
                "111@163.com","000000","000000");
        Assert.assertEquals(getDriver().currentActivity(),".LoginActivity");
    }

    @Test
    public void registerFail(){
        RegisterPage reg=new RegisterPage(getDriver());
        reg.register("","15200000000",
                "111@163.com","000000","000000");
        Assert.assertEquals(getDriver().currentActivity(),".RegisterActivity");
        //返回首页
        getDriver().findElementById("com.example.lx.solarfragment:id/btn_back").click();
    }

}
