package model1;


public class Main {
    public static void main(String[] args) {
    	  VuKhi cung = new CungTen("Cung", "Cung Ten", "Màu vàng", 150);
          VuKhi choi = new Choi("Chọi đá", "Chọi", "Màu đen", 80);

          NhanVat nhanVat1 = new NhanVat("Boa", 1, "Boy", 100, cung);
          KyBinh kyBinh1 = new KyBinh("Nel", 2, "Girl", 200, choi, "Kiếm Bạc", "Giao Đồng", "Cung Gỗ", "Ngựa Chiến", 6);
          BinhDoan binhDoan1 = new BinhDoan("Lucci", 3, "Girl", 300, cung, 50, "Tướng Quân");
          PhuThuy phuThuy1 = new PhuThuy("Ap", 4, "Girl", 120, choi, 10, "Hắc Ám");

          System.out.println(nhanVat1);
          nhanVat1.tanCong();
          nhanVat1.diChuyen();
          nhanVat1.satThuong();

          System.out.println(kyBinh1);
          kyBinh1.tanCong();
          kyBinh1.diChuyen();
          kyBinh1.satThuong();

          System.out.println(binhDoan1);
          binhDoan1.tanCong();
          binhDoan1.diChuyen();
          binhDoan1.satThuong();

          System.out.println(phuThuy1);
          phuThuy1.tanCong();
          phuThuy1.diChuyen();
          phuThuy1.satThuong();
      }
}
