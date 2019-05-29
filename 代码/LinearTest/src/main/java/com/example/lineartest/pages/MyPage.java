package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * Created by 王东慧 on 2019/5/29
 */
public class MyPage {
    AndroidDriver driver;
    Actions action;
    IndexPage index;

    //退出
    @FindBy(id = "me.tictok.linear:id/settings")
    WebElement btn_settings;
    @FindBy(id = "me.tictok.linear:id/logout")
    WebElement btn_logout;
    //我的收藏
    @FindBy(id = "me.tictok.linear:id/myFavorite")
    WebElement btn_myFavorite;
    @FindBy(id = "me.tictok.linear:id/ic_delete")
    WebElement btn_del;

    public MyPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        index = new IndexPage(driver);
    }

    //退出
    public void logout(){
        index.click_index("我的");
        action.click(btn_settings);
        action.click(btn_logout);
    }

    //我的收藏
    public void del_myFavorite(int fromPoint_x,int fromPoint_y , int toPoint_x,int toPoint_y){
        index.click_index("我的");
        action.click(btn_myFavorite);

        //获取删除之前的列表长度
        List<WebElement> list1 = driver.findElementsById("me.tictok.linear:id/mainItem");
        int size1 = list1.size();

        action.drop(fromPoint_x,fromPoint_y,toPoint_x,toPoint_y);
        action.click(btn_del);

        //获取删除之后的列表长度
        List<WebElement> list2 = driver.findElementsById("me.tictok.linear:id/mainItem");
        int size2 = list2.size();
        //根据任务个数进行断言
        Assert.assertEquals(size1-1,size2);
    }


}
