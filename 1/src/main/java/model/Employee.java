package model;

import java.util.Objects;

public class Employee {
    private int ma_nhan_vien;
    private String ho_ten;
    private String ngay_sinh;
    private String  so_cmnd;
    private int luong;
    private String so_dien_thoai;
    private String email;
    private String dia_chi;
    private String ma_vi_tri;
    private String ma_trinh_do;
    private String ma_bo_phan;

    public Employee() {
    }

    public Employee(int ma_nhan_vien, String ho_ten, String ngay_sinh, String so_cmnd, int luong, String so_dien_thoai, String email, String dia_chi, String ma_vi_tri, String ma_trinh_do, String ma_bo_phan) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.so_cmnd = so_cmnd;
        this.luong = luong;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.dia_chi = dia_chi;
        this.ma_vi_tri = ma_vi_tri;
        this.ma_trinh_do = ma_trinh_do;
        this.ma_bo_phan = ma_bo_phan;
    }

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getSo_cmnd() {
        return so_cmnd;
    }

    public void setSo_cmnd(String so_cmnd) {
        this.so_cmnd = so_cmnd;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getMa_vi_tri() {
        return ma_vi_tri;
    }

    public void setMa_vi_tri(String ma_vi_tri) {
        this.ma_vi_tri = ma_vi_tri;
    }

    public String getMa_trinh_do() {
        return ma_trinh_do;
    }

    public void setMa_trinh_do(String ma_trinh_do) {
        this.ma_trinh_do = ma_trinh_do;
    }

    public String getMa_bo_phan() {
        return ma_bo_phan;
    }

    public void setMa_bo_phan(String ma_bo_phan) {
        this.ma_bo_phan = ma_bo_phan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ma_nhan_vien == employee.ma_nhan_vien;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma_nhan_vien);
    }
}
