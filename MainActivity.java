package com.example.oop_and;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SinhVien sinhVien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SinhVien sinhVien = new SinhVien("phuong","khu B",1999);
       // sinhVien.Hovaten = "Nguyen Duy Phuong";
        //sinhVien.DiaChi = "Khu B";
     //   sinhVien.NamSinh = 2000;
        //sinhVien.setNamSinh(1999);
        Toast.makeText(this,sinhVien.getHovaten() + "-" + sinhVien.getDiaChi() + "-" + sinhVien.getNamSinh(),Toast.LENGTH_SHORT).show();

//        SinhVien sinhVien2 = new SinhVien();
//        sinhVien2.Hovaten = "Tran Nguyen Khanh Huyen";
//        sinhVien2.DiaChi = "Khu A";
       // sinhVien2.NamSinh = 2000;
       // Toast.makeText(this,sinhVien2.Hovaten + "-" + sinhVien2.DiaChi,Toast.LENGTH_SHORT).show();


    }
}