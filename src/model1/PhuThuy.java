package model1;

public class PhuThuy extends NhanVat {
	  private int capDo;
	    private String phePhai;

	    public PhuThuy(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhi, int capDo, String phePhai) {
	        super(ten, id, gioiTinh, nangLuong, vuKhi);
	        this.capDo = capDo;
	        this.phePhai = phePhai;
	    }

	    public int getCapDo() {
	        return capDo;
	    }

	    public void setCapDo(int capDo) {
	        this.capDo = capDo;
	    }

	    public String getPhePhai() {
	        return phePhai;
	    }

	    public void setPhePhai(String phePhai) {
	        this.phePhai = phePhai;
	    }

	    @Override
	    public void tanCong() {
	        System.out.println("Phù thủy " + getTen() + " cấp độ " + capDo + " đang sử dụng " + getVuKhi().getTen() + " để tấn công!");
	        getVuKhi().tanCong();
	    }

	    @Override
	    public void diChuyen() {
	        System.out.println("Phù thủy " + getTen() + " di chuyển với sức mạnh phép thuật.");
	    }

	    @Override
	    public void satThuong() {
	        System.out.println("Phù thủy " + getTen() + " gây sát thương bằng phép thuật mạnh mẽ.");
	    }

	    @Override
	    public String toString() {
	        return "PhuThuy [ten=" + getTen() + ", id=" + getId() + ", gioiTinh=" + getGioiTinh() + ", nangLuong=" + getNangLuong() + ", capDo=" + capDo + ", phePhai=" + phePhai + ", vuKhi=" + getVuKhi() + "]";
	    }
}
