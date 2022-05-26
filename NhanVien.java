package TranQuangHuy20204757;

public abstract class NhanVien {
    private String tenNhanVien;
    public abstract double tinhLuong();
    public abstract String inThongTin();

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    /**
     * @return String return the tenNhanVien
     */
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    /**
     * @param tenNhanVien the tenNhanVien to set
     */
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

}