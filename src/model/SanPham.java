package model;

import java.util.Comparator;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double giaCa;

    public SanPham(int maSanPham, String tenSanPham, int soLuong, double giaCa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.giaCa = giaCa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", soLuong=" + soLuong +
                ", giaCa=" + giaCa +
                '}';
    }

    // Comparator theo giaCa
    public static Comparator<SanPham> GiaCaComparator = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham sp1, SanPham sp2) {
            return Double.compare(sp1.getGiaCa(), sp2.getGiaCa());
        }
    };

    // Comparator theo tenSanPham
    public static Comparator<SanPham> TenSanPhamComparator = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham sp1, SanPham sp2) {
            return sp1.getTenSanPham().compareTo(sp2.getTenSanPham());
        }
    };

    // Comparator theo soLuong
    public static Comparator<SanPham> SoLuongComparator = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham sp1, SanPham sp2) {
            return Integer.compare(sp1.getSoLuong(), sp2.getSoLuong());
        }
    };
}

