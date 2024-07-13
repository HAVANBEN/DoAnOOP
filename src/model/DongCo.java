package model;

public class DongCo {
	    private String loaiDongCo;
	    private double congXuat;

	    public DongCo(String loaiDongCo, double congXuat) {
	        this.loaiDongCo = loaiDongCo;
	        this.congXuat = congXuat;
	    }

	    public String getLoaiDongCo() {
	        return loaiDongCo;
	    }

	    public void setLoaiDongCo(String loaiDongCo) {
	        this.loaiDongCo = loaiDongCo;
	    }

	    public double getCongXuat() {
	        return congXuat;
	    }

	    public void setCongXuat(double congXuat) {
	        this.congXuat = congXuat;
	    }

	    @Override
	    public String toString() {
	        return "DongCo{" +
	                "loaiDongCo='" + loaiDongCo + '\'' +
	                ", congXuat=" + congXuat +
	                '}';
	    }
	}

