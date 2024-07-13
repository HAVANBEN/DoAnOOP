package model;
import java.util.ArrayList;
public class HoaDon {
	private int soHoaDon;
    private ArrayList<SanPham> dsSanPham;

    public HoaDon(int soHoaDon, ArrayList<SanPham> dsSanPham) {
        this.soHoaDon = soHoaDon;
        this.dsSanPham = dsSanPham;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public ArrayList<SanPham> getDsSanPham() {
        return dsSanPham;
    }

    public void setDsSanPham(ArrayList<SanPham> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "soHoaDon=" + soHoaDon +
                ", dsSanPham=" + dsSanPham +
                '}';
    }
}
