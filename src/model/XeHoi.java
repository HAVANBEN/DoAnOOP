package model;

	public class XeHoi extends SanPham {
	    private DongCo dongCo;
	    private BanhXe dsbx;

	    public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongCo, BanhXe dsbx) {
	        super(maSanPham, tenSanPham, soLuong, giaCa);
	        this.dongCo = dongCo;
	        this.dsbx = dsbx;
	    }

	    public DongCo getDongCo() {
	        return dongCo;
	    }

	    public void setDongCo(DongCo dongCo) {
	        this.dongCo = dongCo;
	    }

	    public BanhXe getDsbx() {
	        return dsbx;
	    }

	    public void setDsbx(BanhXe dsbx) {
	        this.dsbx = dsbx;
	    }

	    @Override
	    public String toString() {
	        return "XeHoi{" +
	                "dongCo=" + dongCo +
	                ", dsbx=" + dsbx +
	                ", " + super.toString() +
	                '}';
	    }
	}



