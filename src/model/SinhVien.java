package model;

public class SinhVien {
    private String hoTen;
    private String lopHoc;

    public SinhVien(String hoTen, String lopHoc) {
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", lopHoc='" + lopHoc + '\'' +
                '}';
    }
}



