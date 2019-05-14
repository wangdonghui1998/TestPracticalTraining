package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Created by 王东慧 on 2019/5/8
 */

public class RegisterTest extends BaseTest {
    @Test
    public void registerSuccess(){
        RegisterPage reg=new RegisterPage(getDriver());
        reg.register("test1","15200000000",
                "111@163.com","000000","000000");
        Assert.assertEquals(".LoginActivity",getDriver().currentActivity());
    }

    @Test
    public void registerFail(){
        RegisterPage reg=new RegisterPage(getDriver());
        reg.register("","15200000000",
                "111@163.com","000000","000000");
        Assert.assertEquals(".RegisterActivity",getDriver().currentActivity());
    }

}
