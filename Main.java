package TranQuangHuy20204757;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static CongTy congTy = new CongTy();
    public static void main(String[] args) {
        while(true) {
            System.out.println("==> QUAN LY NHAN VIEN <==");
            System.out.println("1. Nhap/Thay doi ten cong ty");
            System.out.println("2. Nhap/Thay doi thong so co ban");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Tang he so luong cua can bo co huu");
            System.out.println("5. Hien thi thong tin cong ty");
            System.out.println("0. Thoat");
            String choose = scanner.nextLine();
            switch(choose) {

                case "1": {
                    System.out.println("-> Nhap ten cong ty: ");
                    String tenCongTy = scanner.nextLine();
                    congTy.setTenCongTy(tenCongTy);
                    System.out.println("=> Ten cong ty sau khi nhap: " + congTy.getTenCongTy());
                    break;
                }

                case "2": {
                    System.out.println(" a. Nhap/Thay doi loi nhuan cong ty");
                    System.out.println(" b. Nhap/Thay doi luong co ban can bo co huu");
                    String type = scanner.nextLine();
                    switch(type) {
                        case "a": {
                            System.out.println("-> Nhap loi nhuan cong ty: ");
                            double loiNhuan = scanner.nextDouble();
                            congTy.setLoiNhuan(loiNhuan);
                            System.out.println("=> Loi nhuan cong ty sau khi nhap: " + congTy.getLoiNhuan());
                            break;
                        }
                        case "b": {
                            System.out.println("-> Nhap luong co ban cua can bo co huu: ");
                            double luongCoBan = scanner.nextDouble();
                            CanBoCoHuu.setLuongCoBan(luongCoBan);
                            break;
                        }

                        default: {
                            System.out.println("Sai cu phap!");
                            continue;
                        }
                    }
                    break;
                }

                case "3": {
                    System.out.println(" - Nhap ten nhan vien: ");
                    String tenNhanVien = scanner.nextLine();
                    System.out.println(" - Phan loai nhan vien");
                    System.out.println(" a. Can bo co huu");
                    System.out.println(" b. Can bo hop dong");
                    String type3 = scanner.nextLine();
                    switch(type3) {
                        case "a": {
                            System.out.println("  - Nhap he so luong: ");
                            double heSoLuong = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("   - Chuc vu nhan vien: ");
                            System.out.println("  a1. Giam doc");
                            System.out.println("  a2. Can bo quan ly");
                            System.out.println("  a3. Truong phong");
                            String choose3 = scanner.nextLine();
                            switch(choose3) {
                                case "a1": {
                                    System.out.println("   - Phu cap giam doc: ");
                                    double phuCap = scanner.nextDouble();
                                    scanner.nextLine();
                                    GiamDoc giamDoc = new GiamDoc(tenNhanVien, heSoLuong, phuCap);
                                    if(congTy.themNV(giamDoc)) {
                                        System.out.println("=> Da them giam doc: ");
                                        System.out.println(giamDoc.inThongTin());
                                    }
                                    else {
                                        System.out.println("Danh sach nhan vien da day!");
                                    }
                                    break;
                                }
                                case "a2": {
                                    CanBoQuanLy canBoQuanLy = new CanBoQuanLy(tenNhanVien, heSoLuong);
                                    if(congTy.themNV(canBoQuanLy)) {
                                        System.out.println("=> Da them can bo quan ly: ");
                                        System.out.println(canBoQuanLy.inThongTin());
                                    }
                                    else {
                                        System.out.println("Danh sach nhan vien da day!");
                                    }
                                    break;
                                }
                                case "a3": {
                                    System.out.println("   - Nhap phu cap: ");
                                    double phuCap = scanner.nextDouble();
                                    scanner.nextLine();
                                    TruongPhong truongPhong = new TruongPhong(tenNhanVien, heSoLuong, phuCap);
                                    if(congTy.themNV(truongPhong)) {
                                        System.out.println("=> Da them truong phong: ");
                                        System.out.println(truongPhong.inThongTin());
                                    }
                                    else {
                                        System.out.println("Danh sach nhan vien da day!");
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        case "b": {
                            System.out.println("   - Nhap luong hop dong: ");
                            double luongHopDong = scanner.nextDouble();
                            CanBoHopDong canBoHopDong = new CanBoHopDong(tenNhanVien, luongHopDong);
                            if(congTy.themNV(canBoHopDong)) {
                                System.out.println("=> Da them can bo hop dong: ");
                                System.out.println(canBoHopDong.inThongTin());
                            }
                            else {
                                System.out.println("Danh sach nhan vien da day!");
                            }
                            break;
                        }
                        default: {
                            System.out.println("Sai cu phap!");
                            continue;
                        }
                    }
                    break;
                }

                case "4": {
                    System.out.println("He thong dang nang cap dich vu :))");
                    break;
                }

                case "5": {
                    congTy.inThongTin();
                    break;
                }

                case "0": {
                    System.out.println("Cam on quy khach da su dung dich vu!");
                    return;
                }

                default: {
                    System.out.println("Cu phap khong hop le!");
                    continue;
                }
            }
        }
    }
}