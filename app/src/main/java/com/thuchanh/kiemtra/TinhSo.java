package com.thuchanh.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TinhSo extends AppCompatActivity {

    EditText SoA , SoB;
    Button Cong , Tru , Nhan , Chia ;
    TextView ketQua ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_so);
        SoA = findViewById(R.id.editSoA);
        SoB = findViewById(R.id.editSoB);
        Cong = findViewById(R.id.btCong);
        Tru = findViewById(R.id.btTru);
        Nhan = findViewById(R.id.btNhan);
        Chia = findViewById(R.id.btChia);
        ketQua = findViewById(R.id.textView);
        Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhTong();
            }
        });
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhTru();
            }
        });
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhNhan();
            }
        });
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhChia();
            }
        });

    }
    public void TinhTong(){
        double A = Double.parseDouble(SoA.getText().toString());
        double B = Double.parseDouble(SoB.getText().toString()) ;
        double kq = A + B;
        ShowKq(kq);
    }
    public void TinhTru(){
        double A = Double.parseDouble(SoA.getText().toString());
        double B = Double.parseDouble(SoB.getText().toString()) ;
        if (A > B){
            double kq = A - B;
            ShowKq(kq);
        }else {
            double kq = A - B;
            ShowKq(-kq);
        }
    }
    public void TinhNhan(){
        double A = Double.parseDouble(SoA.getText().toString());
        double B = Double.parseDouble(SoB.getText().toString()) ;
        double kq = A * B;
        ShowKq(kq);
    }
    public  void  TinhChia(){
        double A = Double.parseDouble(SoA.getText().toString());
        double B = Double.parseDouble(SoB.getText().toString()) ;
        if ( B != 0) {
            double kq = A / B;
            ShowKq(kq);
        } else {
            ketQua.setText("Cannot divide by zero");
        }
    }
    private void ShowKq (double kq){
        ketQua.setText("Ket Qua: " + kq);
    }

}