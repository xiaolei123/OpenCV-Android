package me.xiaolei.testopencv;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.JavaCamera2View;
import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!OpenCVLoader.initDebug()) {
            Log.i("XIAOLEI", "未找到内部OPENCV库。使用OPENCV管理器进行初始化");
        } else {
            Log.i("XIAOLEI", "包内包含OpenCV库。使用它！");
        }
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, 1);
        }

        JavaCamera2View camera_view = findViewById(R.id.camera_view);
        camera_view.enableView();
        camera_view.enableFpsMeter();
        camera_view.setCameraPermissionGranted();
    }
}