package model;

public class Student {
    private int maHocSinh;
    private String hoTenHS;
    private String lop;

    public Student() {
    }

    public Student(int maHocSinh, String hoTenHS, String lop) {
        this.maHocSinh = maHocSinh;
        this.hoTenHS = hoTenHS;
        this.lop = lop;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTenHS() {
        return hoTenHS;
    }

    public void setHoTenHS(String hoTenHS) {
        this.hoTenHS = hoTenHS;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
