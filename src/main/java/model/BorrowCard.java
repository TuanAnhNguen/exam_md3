package model;

import java.util.Date;

public class BorrowCard {
    private String maMuonSach;
    private boolean trangThai;
    private Date ngayMuon;
    private Date ngayTra;

    public BorrowCard() {
    }

    public BorrowCard(String maMuonSach, boolean trangThai, Date ngayMuon, Date ngayTra) {
        this.maMuonSach = maMuonSach;
        this.trangThai = trangThai;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }
}
