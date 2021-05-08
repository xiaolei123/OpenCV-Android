package me.xiaolei.testopencv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!OpenCVLoader.initDebug()) {
            Log.i("XIAOLEI", "未找到内部OPENCV库。使用OPENCV管理器进行初始化");
        } else {
            Log.i("XIAOLEI", "包内包含OpenCV库。使用它！");
        }
    }
}