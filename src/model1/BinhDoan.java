package model1;



public class BinhDoan extends NhanVat {
	   private int soLuongBinhSi;
	    private String tenChiHuy;

	    public BinhDoan(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhi, int soLuongBinhSi, String tenChiHuy) {
	        super(ten, id, gioiTinh, nangLuong, vuKhi);
	        this.soLuongBinhSi = soLuongBinhSi;
	        this.tenChiHuy = tenChiHuy;
	    }

	    public int getSoLuongBinhSi() {
	        return soLuongBinhSi;
	    }

	    public void setSoLuongBinhSi(int soLuongBinhSi) {
	        this.soLuongBinhSi = soLuongBinhSi;
	    }

	    public String getTenChiHuy() {
	        return tenChiHuy;
	    }

	    public void setTenChiHuy(String tenChiHuy) {
	        this.tenChiHuy = tenChiHuy;
	    }

	    @Override
	    public void tanCong() {
	        System.out.println("Binh Đoàn do " + tenChiHuy + " chỉ huy đang tấn công với số lượng binh sĩ là " + soLuongBinhSi + "!");
	        getVuKhi().tanCong();
	    }

	    @Override
	    public void diChuyen() {
	        System.out.println("Binh Đoàn di chuyển với số lượng binh sĩ là " + soLuongBinhSi + ".");
	    }

	    @Override
	    public void satThuong() {
	        System.out.println("Binh Đoàn gây sát thương lớn với số lượng binh sĩ là " + soLuongBinhSi + ".");
	    }

	    @Override
	    public String toString() {
	        return "BinhDoan [ten=" + getTen() + ", id=" + getId() + ", gioiTinh=" + getGioiTinh() + ", nangLuong=" + getNangLuong() + ", soLuongBinhSi=" + soLuongBinhSi + ", tenChiHuy=" + tenChiHuy + ", vuKhi=" + getVuKhi() + "]";
	    }
}
