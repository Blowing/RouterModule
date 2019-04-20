package com.blowing.routermodule;

import com.blowing.lib_base.BaseApplication;

/**
 * Created by wujie
 * on 2019/4/20/020.
 */
public class MyApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        setDistribution(new XzTask());
    }
}
