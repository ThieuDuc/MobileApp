package com.thuchanh.kiemtra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class ThongTin extends AppCompatActivity {
    EditText HoTen , NgaySinh ;
    RadioButton Nam , Nu;
    Button HienThi;
    RadioGroup GrBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);
        HoTen = findViewById(R.id.HoTen);
        NgaySinh = findViewById(R.id.ngaySinh);
        Nam = findViewById(R.id.GtNam);
        Nu = findViewById(R.id.GtNu);
        HienThi = findViewById(R.id.btShow);
        GrBt = findViewById(R.id.grbton);

        // tao Model
        String[] arraySpinner = new String[] { "Cntt", "Kt-Qtkd", "Tieu Hoc", "Ngoai Ngu" };
        Spinner khoa = findViewById(R.id.spnCategory);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        khoa.setAdapter(adapter);

        HienThi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // lay du lieu tu RadioGroup
                int selectedRadio = GrBt.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadio);
                String  selectedRadioButtonText = selectedRadioButton.getText().toString();

                // Lay du lieu tu checkC
                CheckBox LaptrinhC = findViewById(R.id.checkC);
                String selecC = LaptrinhC.getText().toString();

                // Lay du lieu tu checkJaveScript
                CheckBox LaptrinhJS = findViewById(R.id.checkJS);
                String selecJS= LaptrinhC.getText().toString();

                // Lay du lieu tu CheckC#
                CheckBox laptrinhCsap = findViewById(R.id.checkCthang);
                String selecCsap = laptrinhCsap.getText().toString();

                AlertDialog.Builder mydialog2 = new AlertDialog.Builder(ThongTin.this);
                mydialog2.setTitle("Thong Tin");
                mydialog2.setMessage(HoTen.getText().toString() + "\n" + NgaySinh.getText().toString() + "\n" + selectedRadioButtonText + "\n" + selecC + "\n" + selecJS + "\n" + selecCsap + "\n" + khoa.getSelectedItem().toString());
                AlertDialog hienthi = mydialog2.create();
                hienthi.show();
            }
        });
    }
}