/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Ban {

    private String id;
    private String ma;
    private String ten;
    private String ngaySinh;
    private String soThich;
    private int gioiTinh;

    public Ban() {
    }

    public Ban(String id, String ma, String ten, String ngaySinh, String soThich, int gioiTinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public Ban(String ma, String ten, String ngaySinh, String soThich, int gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] toDataRow() {
        return new Object[]{ ten, soThich, gioiTinh == 1 ? "Nam" : "Nu", ngaySinh};
    }
}
