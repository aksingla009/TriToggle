package com.widgt.tritoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TriStateToggleButton tstb_1 =  findViewById(R.id.tstb_1);

        tstb_1.setOnToggleChanged(new TriStateToggleButton.OnToggleChanged() {
            @Override
            public void onToggle(TriStateToggleButton.ToggleStatus toggleStatus, boolean booleanToggleStatus, int toggleIntValue) {
                switch (toggleStatus) {
                    case off:
                        //user tapped on extreme left that is Pay side
                        Log.e(TAG,"OFF STATUS");
                        break;
                    case mid:
                        Log.e(TAG,"MID STATUS");
                        break;
                    case on:
                        //user tapped on extreme right that is receive side
                        Log.e(TAG,"On STATUS");
                        break;
                }
            }
        });
    }
}
