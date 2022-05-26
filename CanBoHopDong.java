package TranQuangHuy20204757;

public class CanBoHopDong extends NhanVien {
    private double luongHopDong;

    public CanBoHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    public double tinhLuong() {
        return luongHopDong;
    }

    public String inThongTin() {
        return super.getTenNhanVien() + " " + this.tinhLuong();
    }

    /**
     * @return double return the luongHopDong
     */
    public double getLuongHopDong() {
        return luongHopDong;
    }

    /**
     * @param luongHopDong the luongHopDong to set
     */
    public void setLuongHopDong(double luongHopDong) {
        this.luongHopDong = luongHopDong;
    }

}