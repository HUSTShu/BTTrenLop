package TranQuangHuy20204757;

public class CanBoQuanLy extends CanBoCoHuu implements QuanLy {

    public CanBoQuanLy(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien, heSoLuong);
    }

    public double tinhHoaHong() {
        return 0.002*CongTy.loiNhuan;
    }
    
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }

    public String inThongTin() {
        return "Can bo quan ly: " + super.inThongTin() + ", hoa hong: " + this.tinhHoaHong();
    }

}