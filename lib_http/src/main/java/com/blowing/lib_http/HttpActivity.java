package com.blowing.lib_http;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.blowing.lib_base.BaseApplication;
import com.blowing.lib_base.TaskDistribution;

public class HttpActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
        textView = findViewById(R.id.tv_text);
        final TaskDistribution taskDistribution = BaseApplication.getInstance().getDistribution();

        textView.setText(taskDistribution.getName());



        findViewById(R.id.btn_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taskDistribution.startActivity();

            }
        });
    }
}
