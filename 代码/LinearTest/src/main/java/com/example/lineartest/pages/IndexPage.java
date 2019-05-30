package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by 王东慧 on 2019/5/28
 * 定位底部菜单栏的各个按钮
 */
public class IndexPage {
    private AndroidDriver driver;
    private Actions action;

    public IndexPage(AndroidDriver driver){
        this.driver = driver;
        action = new Actions(driver);
    }

    public void click_index(String name) {
       List<WebElement> btn =
                driver.findElementById("android:id/tabhost").findElements(By.className("android.widget.LinearLayout"));

        switch (name) {
            case "运动":
                action.click(btn.get(1));
                break;
            case "发现":
                action.click(btn.get(2));
                break;
            case "好友":
                action.click(btn.get(3));
                break;
            case "我的":
                action.click(btn.get(4));
                break;
        }
    }
}
