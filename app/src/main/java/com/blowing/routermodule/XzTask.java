package com.blowing.routermodule;

import com.blowing.lib_base.TaskDistribution;

/**
 * Created by wujie
 * on 2019/4/20/020.
 */
public class XzTask implements TaskDistribution {
    @Override
    public String getName() {
        return Utils.getName();
    }

    @Override
    public void startActivity() {
        Utils.startActivity();
    }
}
