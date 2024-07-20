package model1;

public class CungTen extends VuKhi {
	   public CungTen(String ten, String loaiVuKhi, String mauMa, double sucManh) {
	        super(ten, loaiVuKhi, mauMa, sucManh);
	    }

	    @Override
	    public void tanCong() {
	        if (laVuKhiManh()) {
	            System.out.println("Uy lực của cung tên vô cùng mạnh mẽ, bắn như vũ bão!");
	        } else if (getSucManh() > 0.5 * getSucManh()) {
	            System.out.println("Cung thủ bắn ra một mũi tên chính xác và mạnh mẽ!");
	        } else {
	            System.out.println("Sức mạnh của cung thủ không đủ, quân ta đang yếu dần.");
	        }
	    }

	    @Override
	    public void diChuyen() {
	        System.out.println("Cung thủ vừa chạy vừa bắn tên, di chuyển linh hoạt!");
	    }

	    @Override
	    public void satThuong() {
	        System.out.println("Cung tên gây sát thương tầm xa và có khả năng xuyên phá cao!");
	    }

	    @Override
	    public String toString() {
	        return "CungTen [ten=" + getTen() + ", loaiVuKhi=" + getLoaiVuKhi() + ", mauMa=" + getMauMa() + ", sucManh=" + getSucManh() + "]";
	    }
}
