package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("Menu:");
			    System.out.println("1. Thêm sản phẩm");
			    System.out.println("2. Sắp xếp sản phẩm theo giá");
			    System.out.println("3. Sắp xếp sản phẩm theo tên");
			    System.out.println("4. Sắp xếp sản phẩm theo số lượng");
			    System.out.println("5. Hiển thị danh sách sản phẩm");
			    System.out.println("6. Thoát");
			    System.out.print("Chọn chức năng: ");
			    int choice = scanner.nextInt();
			    scanner.nextLine();  // Consume newline

			    switch (choice) {
			        case 1:
			            System.out.print("Nhập mã sản phẩm: ");
			            int maSanPham = scanner.nextInt();
			            scanner.nextLine();  // Consume newline

			            System.out.print("Nhập tên sản phẩm: ");
			            String tenSanPham = scanner.nextLine();

			            System.out.print("Nhập số lượng: ");
			            int soLuong = scanner.nextInt();

			            System.out.print("Nhập giá: ");
			            double giaCa = scanner.nextDouble();

			            SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, giaCa);
			            dsSanPham.add(sanPham);
			            break;

			        case 2:
			            Collections.sort(dsSanPham, SanPham.GiaCaComparator);
			            System.out.println("Sản phẩm sắp xếp theo giá:");
			            for (SanPham sp : dsSanPham) {
			                System.out.println(sp);
			            }
			            break;

			        case 3:
			            Collections.sort(dsSanPham, SanPham.TenSanPhamComparator);
			            System.out.println("Sản phẩm sắp xếp theo tên:");
			            for (SanPham sp : dsSanPham) {
			                System.out.println(sp);
			            }
			            break;

			        case 4:
			            Collections.sort(dsSanPham, SanPham.SoLuongComparator);
			            System.out.println("Sản phẩm sắp xếp theo số lượng:");
			            for (SanPham sp : dsSanPham) {
			                System.out.println(sp);
			            }
			            break;

			        case 5:
			            System.out.println("Danh sách sản phẩm:");
			            for (SanPham sp : dsSanPham) {
			                System.out.println(sp);
			            }
			            break;

			        case 6:
			            System.out.println("Thoát chương trình.");
			            System.exit(0);

			        default:
			            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			    }
			}
		}
    }
}
