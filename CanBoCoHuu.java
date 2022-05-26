package TranQuangHuy20204757;

public class CanBoCoHuu extends NhanVien {
    private static double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 1000000;

    public CanBoCoHuu(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien);
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

    public String inThongTin(){
        return super.getTenNhanVien() + " " + this.tinhLuong();
    }

    public boolean tangHeSoLuong(double heSoTang) {
        if(luongCoBan*(heSoLuong + heSoTang) > LUONG_MAX) {
            return false;
        }
        else {
            heSoLuong += heSoTang;
            return true;
        }
    }

    /**
     * @return double return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan1) {
        luongCoBan = luongCoBan1;
    }

}