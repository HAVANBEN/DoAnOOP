package model1;

public class KyBinh extends NhanVat {
	 private String kiem;
	    private String giao;
	    private String cung;
	    private String ngua;
	    private int soNamDaoTao;

	    public KyBinh(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhiChinh, String kiem, String giao, String cung, String ngua, int soNamDaoTao) {
	        super(ten, id, gioiTinh, nangLuong, vuKhiChinh);
	        this.kiem = kiem;
	        this.giao = giao;
	        this.cung = cung;
	        this.ngua = ngua;
	        this.soNamDaoTao = soNamDaoTao;
	    }

	    public String getKiem() {
	        return kiem;
	    }

	    public void setKiem(String kiem) {
	        this.kiem = kiem;
	    }

	    public String getGiao() {
	        return giao;
	    }

	    public void setGiao(String giao) {
	        this.giao = giao;
	    }

	    public String getCung() {
	        return cung;
	    }

	    public void setCung(String cung) {
	        this.cung = cung;
	    }

	    public String getNgua() {
	        return ngua;
	    }

	    public void setNgua(String ngua) {
	        this.ngua = ngua;
	    }

	    public int getSoNamDaoTao() {
	        return soNamDaoTao;
	    }

	    public void setSoNamDaoTao(int soNamDaoTao) {
	        this.soNamDaoTao = soNamDaoTao;
	    }

	    @Override
	    public void tanCong() {
	        String attackDescription;
	        if (soNamDaoTao >= 5) {
	            if (getVuKhi().laVuKhiManh()) {
	                attackDescription = "Kỵ Binh với kinh nghiệm và sức mạnh vượt trội, tấn công với " + getVuKhi().getTen() + " vô cùng mãnh liệt!";
	            } else {
	                attackDescription = "Kỵ Binh sử dụng " + getVuKhi().getTen() + " tấn công mãnh liệt!";
	            }
	        } else {
	            attackDescription = "Kỵ Binh tấn công với kinh nghiệm chưa cao!";
	        }
	        System.out.println(attackDescription);
	    }

	    @Override
	    public void diChuyen() {
	        String moveDescription = "Kỵ Binh di chuyển linh hoạt";
	        if (ngua != null) {
	            moveDescription += ", cưỡi " + ngua;
	        }
	        moveDescription += ".";
	        System.out.println(moveDescription);
	    }

	    @Override
	    public void satThuong() {
	        System.out.println("Kỵ Binh gây sát thương mạnh mẽ.");
	    }

	    @Override
	    public String toString() {
	        return "KyBinh [ten=" + getTen() + ", id=" + getId() + ", gioiTinh=" + getGioiTinh() + ", nangLuong=" + getNangLuong() + ", kiem=" + kiem + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", soNamDaoTao=" + soNamDaoTao + ", vuKhi=" + getVuKhi() + "]";
	    }
}
