package com.example.wdh.uiautomator.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;

/**
 * Created by 王东慧 on 2019/6/4
 */
public class GetCurrentActivity {

    public static String currentActivity() {
        Context context = InstrumentationRegistry.getTargetContext();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        String runningActivity = activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
        return runningActivity;
    }


}
