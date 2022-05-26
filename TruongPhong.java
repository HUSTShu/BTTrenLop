package TranQuangHuy20204757;

public class TruongPhong extends CanBoCoHuu {
    private double phuCap;

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }

    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    public String inThongTin() {
        return "Truong phong: " + super.inThongTin() + ", phu cap: " + this.getPhuCap() + " ";
    }

    /**
     * @return double return the phuCap
     */
    public double getPhuCap() {
        return phuCap;
    }

    /**
     * @param phuCap the phuCap to set
     */
    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

}