package com.blowing.routermodule;

import android.content.Intent;
import com.blowing.lib_base.BaseApplication;

/**
 * Created by wujie
 * on 2019/4/20/020.
 */
public class Utils {

    public static String getName() {
        return "小酒喝起走，只要半斤酒";
    }

    public static void startActivity() {
        Intent intent = new Intent(BaseApplication.getInstance(), MainActivity.class);
        BaseApplication.getInstance().startActivity(intent);
    }
}
