package com.example.wdh.uiautomator.testcase;

import android.support.test.uiautomator.UiObjectNotFoundException;

import com.example.wdh.uiautomator.base.BaseTest;
import com.example.wdh.uiautomator.pages.LoginPage;
import com.example.wdh.uiautomator.pages.TaskPage;
import com.example.wdh.uiautomator.utils.GetCurrentActivity;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess()  {
        LoginPage loginsuccess = new LoginPage(getDevice());
        loginsuccess.login("jiaxinrui", "000000");
    }

}
