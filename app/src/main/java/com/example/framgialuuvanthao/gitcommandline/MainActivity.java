package com.example.framgialuuvanthao.gitcommandline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDisplay = findViewById(R.id.txtDisplay);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                txtDisplay.setText("current thread: " + Thread.currentThread().getName());
            }
        });
        thread.start();
    }
}
