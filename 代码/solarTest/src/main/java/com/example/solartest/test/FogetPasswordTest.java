package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.ForgetPasswordPage;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by 王东慧 on 2019/5/8
 */
public class FogetPasswordTest extends BaseTest {

    @Test
    public void fpSuccess() throws InterruptedException {
        ForgetPasswordPage fp = new ForgetPasswordPage(getDriver());
        fp.forgetPassword("jaixinrui","15226529795","1019785953@qq.com");
        Assert.assertEquals(".LoginActivity",getDriver().currentActivity());
        //该测试会失败，原因为忘记密码功能不能用
    }

    @Test
    public void fpFail() throws InterruptedException {
        ForgetPasswordPage fp = new ForgetPasswordPage(getDriver());
        fp.forgetPassword("","15226529795","1019785953@qq.com");
        Assert.assertEquals(".LoginActivity",getDriver().currentActivity());
    }
}
