package com.example.lab4_ph34455;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab4_ph34455.R;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),ManActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"On Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"On Destroy");
    }
}