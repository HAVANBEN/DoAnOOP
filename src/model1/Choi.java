package model1;

public class Choi extends VuKhi  {
	public Choi(String ten, String loaiVuKhi, String mauMa, double sucManh) {
        super(ten, loaiVuKhi, mauMa, sucManh);
    }

    @Override
    public void tanCong() {
        if (laVuKhiManh()) {
            System.out.println("Chọi tấn công mạnh!");
        } else {
            System.out.println("Chọi sử dụng tấn công bình thường.");
        }
    }

    @Override
    public void diChuyen() {
        System.out.println(" di chuyển.");
    }

    @Override
    public void satThuong() {
        System.out.println(" gây sát thương.");
    }

    @Override
    public String toString() {
        return "Choi [ten=" + getTen() + ", mauMa=" + getMauMa() + ", sucManh=" + getSucManh() + "]";
    }
}

