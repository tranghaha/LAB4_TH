package lab4_th;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	String HoTen;int MSSV;
        ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
        ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ Tên: ");
        HoTen = sc.nextLine();
        System.out.print("Nhập MSSV: ");
        MSSV = sc.nextInt(); 
        System.out.print("Nhập số giao dịch đất: ");
        soGiaoDichDat = sc.nextInt();
        System.out.print("Nhập số giao dịch nhà: ");
        soGiaoDichNha = sc.nextInt();

        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            arrGiaoDichDat.add(giaoDichDat);
        }
         
        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            arrGiaoDichNha.add(giaoDichNha);
        }
         
        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
         
        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
         
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            if (arrGiaoDichDat.get(i).getLoaidat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                    arrGiaoDichDat.get(i).getDongia() * 1.5;
            } else if (arrGiaoDichDat.get(i).getLoaidat().equalsIgnoreCase("B") || 
                    arrGiaoDichDat.get(i).getLoaidat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                    arrGiaoDichDat.get(i).getDongia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
         
        // xuất ra các giao dịch của tháng 5 năm 2023
        System.out.println("Các giao dịch đất của tháng 5 năm 2023: ");
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgaygiaodich().split("/");
            if (dateGiaoDichDat[1].equals("5") && dateGiaoDichDat[2].equals("2023")) {
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }
         
        System.out.println("Các giao dịch nhà của tháng 5 năm 2023: ");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgaygiaodich().split("/");
            if (dateGiaoDichNha[1].equals("5") && dateGiaoDichNha[2].equals("2023")) {
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }
        
    }
 
}