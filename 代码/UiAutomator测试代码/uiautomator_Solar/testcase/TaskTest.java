package com.example.wdh.uiautomator.testcase;

import com.example.wdh.uiautomator.base.BaseTest;
import com.example.wdh.uiautomator.pages.LoginPage;
import com.example.wdh.uiautomator.pages.TaskPage;
import com.example.wdh.uiautomator.utils.GetCurrentActivity;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by 王东慧 on 2019/6/5
 */
public class TaskTest extends BaseTest {
    @Before
    public void login(){
        LoginPage loginsuccess = new LoginPage(getDevice());
        loginsuccess.login("jiaxinrui", "000000");
    }

    @Test
    public void del_task(){
        TaskPage taskPage = new TaskPage(getDevice());
        taskPage.deleteTask(1);
    }

    @Test
    public void edit_task(){
        TaskPage taskPage = new TaskPage(getDevice());
        taskPage.editTask(1,"abc","12");
    }

    @Test
    public void new_task(){
        TaskPage taskPage = new TaskPage(getDevice());
        taskPage.newTask("running","30");
    }

    @Test
    public void start_task(){
        TaskPage taskPage = new TaskPage(getDevice());
        taskPage.startTask(1);
    }
}
