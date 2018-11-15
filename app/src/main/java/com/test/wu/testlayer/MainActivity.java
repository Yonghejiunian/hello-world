package com.test.wu.testlayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.izuiyou.json.JSONUtils;
//import com.test.wu.foundation.Plus;

public class MainActivity extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.test_num);
        //int n = Plus.plusTheNum();
        JSONUtils.contains(null, null);



        //textView.setText("我是："+n);
    }
}
