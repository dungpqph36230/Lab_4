package com.example.lab_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bai3_p2 extends AppCompatActivity {
    public static String Key_username = "username";
    public static String Key_password = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3p2);
        EditText editText = findViewById(R.id.edtUser);
        EditText editText1 = findViewById(R.id.edtPass);
        EditText editText2 = findViewById(R.id.edtrePass);
        Button button = findViewById(R.id.btn_dk1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String tk = editText.getText().toString();
                String mk = editText1.getText().toString();
                String rmk = editText2.getText().toString();
                if(tk == null || tk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua nhap UserName", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(mk == null || mk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua nhap Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(rmk == null || rmk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua xac nhan Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!rmk.equals(mk)){
                    Toast.makeText(bai3_p2.this, "Khong khop password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(),bai3_p1.class);
                intent.putExtra(Key_username,tk);
                intent.putExtra(Key_password,mk);
                startActivity(intent);
            }
        });
    }
}