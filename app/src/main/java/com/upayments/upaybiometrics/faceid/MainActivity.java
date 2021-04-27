package com.upayments.upaybiometrics.faceid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.upaybiometrics.faceidlib.BioCaller;
import com.upaybiometrics.faceidlib.models.FaceIdResultData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            BioCaller.documentScan(this, 22);
        } catch(Exception e ){
            Log.d("TAG", "");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FaceIdResultData result = BioCaller.getFaceIdResultData();
        Log.d("TAG", "");
    }
}