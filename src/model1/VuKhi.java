package model1;

public abstract class VuKhi {
	 private String ten;
	    private String loaiVuKhi;
	    private String mauMa;
	    private double sucManh;

	    public VuKhi(String ten, String loaiVuKhi, String mauMa, double sucManh) {
	        this.ten = ten;
	        this.loaiVuKhi = loaiVuKhi;
	        this.mauMa = mauMa;
	        this.sucManh = sucManh;
	    }

	    public abstract void tanCong();
	    public abstract void diChuyen();
	    public abstract void satThuong();

	    // Getter và setter
	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public String getLoaiVuKhi() {
	        return loaiVuKhi;
	    }

	    public void setLoaiVuKhi(String loaiVuKhi) {
	        this.loaiVuKhi = loaiVuKhi;
	    }

	    public String getMauMa() {
	        return mauMa;
	    }

	    public void setMauMa(String mauMa) {
	        this.mauMa = mauMa;
	    }

	    public double getSucManh() {
	        return sucManh;
	    }

	    public void setSucManh(double sucManh) {
	        this.sucManh = sucManh;
	    }

	    public boolean laVuKhiManh() {
	        return this.sucManh > 100; // Giả định rằng vũ khí mạnh khi sức mạnh lớn hơn 100
	    }
	        @Override
	        public String toString() {
	            return "VuKhi [ten=" + ten + ", loaiVuKhi=" + loaiVuKhi + ", mauMa=" + mauMa + ", sucManh=" + sucManh + "]";
	    }
	}

