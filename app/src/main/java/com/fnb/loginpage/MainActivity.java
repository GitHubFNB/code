package com.fnb.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //warning 打印警告信息
        Log.w(TAG, "onCreate: " + "warning");
        //error 打印错误信息
        Log.e(TAG, "onCreate: " + "error");
        //debug 打印调试信息
        Log.d(TAG, "onCreate: " + "debug");
        //info 打印一般提示信息
        Log.i(TAG, "onCreate: " + "info");
        //log method name and its arguments 打印方法名和参数
        Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");

        //输入“logr”: (TAG,String)
        //log result of this method 打印方法的返回值
        Log.d(TAG, "onCreate() returned: hello world");
    }
}
