package com.blowing.lib_base;

import android.app.Application;

/**
 * Created by wujie
 * on 2019/4/20/020.
 */
public class BaseApplication extends Application {

    private static BaseApplication instance;

    private TaskDistribution distribution;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static BaseApplication getInstance() {
        return instance;
    }

    public void setDistribution(TaskDistribution distribution) {
        this.distribution = distribution;
    }

    public TaskDistribution getDistribution() {
        return distribution;
    }
}
