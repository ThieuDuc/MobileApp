package com.thuchanh.kiemtra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Username , passWord;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.btLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.equals("admin") && passWord.equals("Admin123_")){
                    Intent myIntent = new Intent(MainActivity.this,TrangChu.class);
                    startActivity(myIntent);
                }else {
                    AlertDialog.Builder mydialog = new AlertDialog.Builder(MainActivity.this);
                    mydialog.setTitle("Login");
                    mydialog.setMessage("Ten dang nhap hoac mat khau khong dung !!!");
                    mydialog.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    AlertDialog dialog = mydialog.create();
                    dialog.show();
                }

            }
        });
    }


}