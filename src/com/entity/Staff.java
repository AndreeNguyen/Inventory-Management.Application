/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

public class Staff {

    private String MaSP;
    private String TenSp;
    private float Gia;
    private String DonVi;
    private String LoaiSP;
    private String NhaCC;
    private String NSX;
    private String NHH;
    private String MaKho;
    private String Khu;
    private int SoLuong;
    private String tenKhoSP;
    private String MaKhu;

    public Staff() {

    }

    public Staff(String maSP, String tenSp, float gia, String donVi, String loaiSP, String nhaCC, String nSX,
            String nHH, String maKho, String khu, int soLuong, String tenKhoSP, String maKhu) {
        super();
        MaSP = maSP;
        TenSp = tenSp;
        Gia = gia;
        DonVi = donVi;
        LoaiSP = loaiSP;
        NhaCC = nhaCC;
        NSX = nSX;
        NHH = nHH;
        MaKho = maKho;
        Khu = khu;
        SoLuong = soLuong;
        this.tenKhoSP = tenKhoSP;
        MaKhu = maKhu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float gia) {
        Gia = gia;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String donVi) {
        DonVi = donVi;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        LoaiSP = loaiSP;
    }

    public String getNhaCC() {
        return NhaCC;
    }

    public void setNhaCC(String nhaCC) {
        NhaCC = nhaCC;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String nSX) {
        NSX = nSX;
    }

    public String getNHH() {
        return NHH;
    }

    public void setNHH(String nHH) {
        NHH = nHH;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String maKho) {
        MaKho = maKho;
    }

    public String getKhu() {
        return Khu;
    }

    public void setKhu(String khu) {
        Khu = khu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getTenKhoSP() {
        return tenKhoSP;
    }

    public void setTenKhoSP(String tenKhoSP) {
        this.tenKhoSP = tenKhoSP;
    }

    public String getMaKhu() {
        return MaKhu;
    }

    public void setMaKhu(String maKhu) {
        MaKhu = maKhu;
    }

}
