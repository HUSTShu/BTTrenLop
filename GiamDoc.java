package TranQuangHuy20204757;

public class GiamDoc extends CanBoCoHuu implements QuanLy {
    private double phuCap;

    public GiamDoc(String tenNhanVien, double heSoLuong, double phuCap) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }

    public double tinhHoaHong() {
        return 0.05*CongTy.loiNhuan;
    }

    public double tinhLuong(){
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }

    public String inThongTin() {
        return "Giam doc: " + super.inThongTin() + ", phu cap: " + this.getPhuCap() + ", hoa hong: " + this.tinhHoaHong();
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