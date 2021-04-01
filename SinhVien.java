package com.example.oop_and;

import android.widget.Toast;

public class SinhVien {
    private String Hovaten;
    private String DiaChi;
    private int NamSinh;

    public SinhVien(String hovaten, String diaChi, int namSinh) {
        Hovaten = hovaten;
        DiaChi = diaChi;
        NamSinh = namSinh;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }
    //    public int getNamSinh() {
//        return NamSinh;
//    }
//
//    public void setNamSinh(int namSinh) {
//        if(namSinh > 2000)
//        NamSinh = namSinh;
//        else
//            NamSinh = 1990;
//    }
}
