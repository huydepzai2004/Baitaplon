package pxu.edu.vn.doan;

import java.util.Scanner;

public class BaiTapLon {

//ham nhap so luong sinh vien n nguyen duong 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hoten

	}
	
	//Ham nhap so luong sinh vien N nguyen duong
	public static int nhapSoLuongSinhVien() {
		try {int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap so luong sinh vien n = ");
			n = sc.nextInt();
		}while( n <= 0);
		return n;
	}catch(Exception e) {
		System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		return -1;
	}
}
	//Ham nhap ho ten, diem Toan, Van Anh
	public static void nhapHoTenVaDiem(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh) {
		
	}
	//Ham tinh diem trung binh
	
	//Ham sap xep sinh  vien theo chieu giam dan cua diem trung binh
	public static void sapxepDSSV(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham in danh sach sinh vien ra man hinh
	public static void inDSSV(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham tim kiem sinh vien theo diem mon Toan
	public static void timkiemDiem(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham tim kiem sinh vien theo ho ten
	public static void timHoTen(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
}