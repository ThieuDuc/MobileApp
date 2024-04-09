package com.thuchanh.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangChu extends AppCompatActivity {
    Button TinhSo , ThongTin , CongViec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        TinhSo = findViewById(R.id.btTinh2so);
        ThongTin = findViewById(R.id.btThongTin);
        CongViec = findViewById(R.id.btCongviec);
        TinhSo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent tinhso = new Intent(TrangChu.this , TinhSo.getClass());
               startActivity(tinhso);
           }
       });
        ThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thongtin = new Intent(TrangChu.this , ThongTin.getClass());
                startActivity(thongtin);
            }
        });
        CongViec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent congviec = new Intent(TrangChu.this , CongViec.getClass());
                startActivity(congviec);
            }
        });
    }
}