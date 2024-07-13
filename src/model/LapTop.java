package model;

public class LapTop extends SanPham {
    private int ram;
    private String CPU;

    public LapTop(int maSanPham, String tenSanPham, int soLuong, double giaCa, int ram, String CPU) {
        super(maSanPham, tenSanPham, soLuong, giaCa);
        this.ram = ram;
        this.CPU = CPU;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "ram=" + ram +
                ", CPU='" + CPU + '\'' +
                ", " + super.toString() +
                '}';
    }
}

