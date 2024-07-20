package model1;

public class NhanVat implements DiChuyen {
	
	private String ten;
    private int id;
    private String gioiTinh;
    private double nangLuong;
    private VuKhi vuKhi;

    public NhanVat(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhi) {
        this.ten = ten;
        this.id = id;
        this.gioiTinh = gioiTinh;
        this.nangLuong = nangLuong;
        this.vuKhi = vuKhi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(double nangLuong) {
        this.nangLuong = nangLuong;
    }

    public VuKhi getVuKhi() {
        return vuKhi;
    }

    public void setVuKhi(VuKhi vuKhi) {
        this.vuKhi = vuKhi;
    }

    @Override
    public void trai() {
        System.out.println("Nhân vật di chuyển sang trái.");
    }

    @Override
    public void phai() {
        System.out.println("Nhân vật di chuyển sang phải.");
    }

    @Override
    public void len() {
        System.out.println("Nhân vật di chuyển lên.");
    }

    @Override
    public void xuong() {
        System.out.println("Nhân vật di chuyển xuống.");
    }

    public void tanCong() {
        vuKhi.tanCong();
    }

    public void diChuyen() {
        vuKhi.diChuyen();
    }

    public void satThuong() {
        vuKhi.satThuong();
    }

    @Override
    public String toString() {
        return "NhanVat [ten=" + ten + ", id=" + id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + ", vuKhi=" + vuKhi + "]";
    }
}
