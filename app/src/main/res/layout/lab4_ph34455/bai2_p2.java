package com.example.lab4_ph34455;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bai2_p2 extends AppCompatActivity {
    public static String Key_gia = "giasp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2p2);
        String gia1 = getIntent().getStringExtra(bai2_p2.Key_gia);
        TextView textView = findViewById(R.id.tv_mua);
        textView.setText(gia1);
        EditText editText = findViewById(R.id.edt_gia);
        Button button =findViewById(R.id.btn_bg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gia = editText.getText().toString();
                if(gia == null || gia.equals("")){
                    Toast.makeText(bai2_p2.this, "Bạn chưa nhập giá sản phẩm", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(),bai2_p1.class);
                    intent.putExtra(Key_gia,gia);
                    startActivity(intent);
                }
            }
        });
    }
}