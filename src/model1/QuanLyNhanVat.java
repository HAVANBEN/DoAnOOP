package model1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model1.business.DBConnection;

public class QuanLyNhanVat {
    private List<NhanVat> danhSachNhanVat;

    public QuanLyNhanVat() {
        this.danhSachNhanVat = new ArrayList<>();
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân vật cần thêm: ");
        int soLuongNhanVat = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuongNhanVat; i++) {
            System.out.println("Nhập tên nhân vật:");
            String ten = scanner.nextLine();
            System.out.println("Nhập ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập giới tính:");
            String gioiTinh = scanner.nextLine();
            System.out.println("Nhập năng lượng:");
            double nangLuong = scanner.nextDouble();
            scanner.nextLine();

            NhanVat nhanVat = new NhanVat(ten, id, gioiTinh, nangLuong, null);
            danhSachNhanVat.add(nhanVat);
            System.out.println("Nhân vật đã được thêm.");
        }
    }

    public void xuatDuLieu() {
        if (danhSachNhanVat.isEmpty()) {
            System.out.println("Danh sách nhân vật trống.");
            return;
        }
        System.out.println("\nDanh sách nhân vật:");
        for (NhanVat nhanVat : danhSachNhanVat) {
            System.out.println(nhanVat);
        }
    }

    public void sapXepTheoID() {
        Collections.sort(danhSachNhanVat, Comparator.comparingInt(NhanVat::getId));
    }

    public void sapXepTheoTen() {
        Collections.sort(danhSachNhanVat, Comparator.comparing(NhanVat::getTen));
    }

    public NhanVat timKiemTheoID(int id) {
        return danhSachNhanVat.stream()
                .filter(nv -> nv.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public NhanVat timKiemTheoTen(String ten) {
        return danhSachNhanVat.stream()
                .filter(nv -> nv.getTen().equalsIgnoreCase(ten))
                .findFirst()
                .orElse(null);
    }

    public void suaNhanVat(int id) {
        Scanner scanner = new Scanner(System.in);
        NhanVat nhanVat = timKiemTheoID(id);
        if (nhanVat != null) {
            System.out.println("Nhập tên nhân vật mới:");
            nhanVat.setTen(scanner.nextLine());
            System.out.println("Nhập giới tính mới:");
            nhanVat.setGioiTinh(scanner.nextLine());
            System.out.println("Nhập năng lượng mới:");
            nhanVat.setNangLuong(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Thông tin nhân vật đã được cập nhật.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void xoaNhanVat(int id) {
        NhanVat nhanVat = timKiemTheoID(id);
        if (nhanVat != null) {
            danhSachNhanVat.remove(nhanVat);
            System.out.println("Nhân vật đã được xóa.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void themVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên vũ khí:");
            String ten = scanner.nextLine();
            System.out.println("Nhập loại vũ khí:");
            String loaiVuKhi = scanner.nextLine();
            System.out.println("Nhập màu mã:");
            String mauMa = scanner.nextLine();
            System.out.println("Nhập sức mạnh:");
            double sucManh = scanner.nextDouble();
            scanner.nextLine();

            VuKhi vuKhi = new VuKhi(ten, loaiVuKhi, mauMa, sucManh) {
                @Override
                public void tanCong() {
                    System.out.println("Vũ khí tấn công.");
                }

                @Override
                public void diChuyen() {
                    System.out.println("Vũ khí di chuyển.");
                }

                @Override
                public void satThuong() {
                    System.out.println("Vũ khí gây sát thương.");
                }
            };
            nhanVat.setVuKhi(vuKhi);
            System.out.println("Vũ khí đã được thêm.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void xoaVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            nhanVat.setVuKhi(null);
            System.out.println("Vũ khí đã được xóa.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void hienThiDanhSachVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            VuKhi vuKhi = nhanVat.getVuKhi();
            if (vuKhi == null) {
                System.out.println("Nhân vật không có vũ khí.");
            } else {
                System.out.println("Vũ khí của nhân vật " + nhanVat.getTen() + ": " + vuKhi);
            }
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void quanLyVuKhi() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n╔══════════════════════════════════════════════╗");
            System.out.println("║          Menu Quản Lý Vũ Khí                   ║");
            System.out.println("╠════════════════════════════════════════════════╣");
            System.out.println("║ 1. Thêm vũ khí vào nhân vật                    ║");
            System.out.println("║ 2. Xóa vũ khí khỏi nhân vật                    ║");
            System.out.println("║ 3. Hiển thị danh sách vũ khí của nhân vật      ║");
            System.out.println("║ 4. Quay lại                                    ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            System.out.print("Chọn một tùy chọn (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 4: ");
                scanner.next(); // consume invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID nhân vật để thêm vũ khí: ");
                    int idThemVuKhi = scanner.nextInt();
                    scanner.nextLine();
                    themVuKhi(idThemVuKhi);
                    break;
                case 2:
                    System.out.print("Nhập ID nhân vật để xóa vũ khí: ");
                    int idXoaVuKhi = scanner.nextInt();
                    scanner.nextLine();
                    xoaVuKhi(idXoaVuKhi);
                    break;
                case 3:
                    System.out.print("Nhập ID nhân vật để hiển thị danh sách vũ khí: ");
                    int idHienThiVuKhi = scanner.nextInt();
                    scanner.nextLine();
                    hienThiDanhSachVuKhi(idHienThiVuKhi);
                    break;
                case 4:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 4);
    }

    private void ketNoiDatabase() {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            System.out.println("Kết nối CSDL thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Kết nối CSDL không thành công");
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVat quanLyNhanVat = new QuanLyNhanVat();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║              Menu Quản Lý Nhân Vật           ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║ 1. Nhập dữ liệu nhân vật                     ║");
            System.out.println("║ 2. Hiển thị danh sách nhân vật               ║");
            System.out.println("║ 3. Sắp xếp nhân vật theo ID                  ║");
            System.out.println("║ 4. Sắp xếp nhân vật theo tên                 ║");
            System.out.println("║ 5. Tìm kiếm nhân vật theo ID                 ║");
            System.out.println("║ 6. Tìm kiếm nhân vật theo tên                ║");
            System.out.println("║ 7. Sửa thông tin nhân vật                    ║");
            System.out.println("║ 8. Xóa nhân vật                              ║");
            System.out.println("║ 9. Quản lý vũ khí                            ║");
            System.out.println("║ 10. Kết nối CSDL                             ║");
            System.out.println("║ 11. Thoát                                    ║");
            System.out.println("╚══════════════════════=═══════════════════════╝");
            System.out.print("Chọn một tùy chọn (1-11): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 11: ");
                scanner.next(); // consume invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    quanLyNhanVat.nhapDuLieu();
                    break;
                case 2:
                    quanLyNhanVat.xuatDuLieu();
                    break;
                case 3:
                    quanLyNhanVat.sapXepTheoID();
                    break;
                case 4:
                    quanLyNhanVat.sapXepTheoTen();
                    break;
                case 5:
                    System.out.print("Nhập ID nhân vật để tìm kiếm: ");
                    int idTimKiem = scanner.nextInt();
                    scanner.nextLine();
                    NhanVat nvTimKiemID = quanLyNhanVat.timKiemTheoID(idTimKiem);
                    if (nvTimKiemID != null) {
                        System.out.println(nvTimKiemID);
                    } else {
                        System.out.println("Không tìm thấy nhân vật.");
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên nhân vật để tìm kiếm: ");
                    String tenTimKiem = scanner.nextLine();
                    NhanVat nvTimKiemTen = quanLyNhanVat.timKiemTheoTen(tenTimKiem);
                    if (nvTimKiemTen != null) {
                        System.out.println(nvTimKiemTen);
                    } else {
                        System.out.println("Không tìm thấy nhân vật.");
                    }
                    break;
                case 7:
                    System.out.print("Nhập ID nhân vật để sửa: ");
                    int idSua = scanner.nextInt();
                    scanner.nextLine();
                    quanLyNhanVat.suaNhanVat(idSua);
                    break;
                case 8:
                    System.out.print("Nhập ID nhân vật để xóa: ");
                    int idXoa = scanner.nextInt();
                    scanner.nextLine();
                    quanLyNhanVat.xoaNhanVat(idXoa);
                    break;
                case 9:
                    quanLyNhanVat.quanLyVuKhi();
                    break;
                case 10:
                    quanLyNhanVat.ketNoiDatabase();
                    break;
                case 11:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 11);
    }
}
