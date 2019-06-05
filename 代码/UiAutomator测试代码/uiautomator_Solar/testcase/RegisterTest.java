package com.example.wdh.uiautomator.testcase;

import com.example.wdh.uiautomator.base.BaseTest;
import com.example.wdh.uiautomator.pages.RegisterPage;

import org.junit.Test;

/**
 * Created by 王东慧 on 2019/6/5
 */
public class RegisterTest extends BaseTest {
    @Test
    public void register(){
        RegisterPage reg = new RegisterPage(getDevice());
        reg.register("test1","15200000000",
                "111@163.com","000000","000000");
    }
}
