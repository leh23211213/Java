/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv_btvn;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author KHUONG
 */
public class so_DoiXung_Bai3 {

    /**
     * @param args the command line arguments
     */
    public boolean kiemTraDoiXung(int x) {
        int truoc = x;
        int sau = 0;
        while (x > 0) {
            sau = sau * 10 + x % 10;
            x = x / 10;
        }
        return truoc == sau;
    }

    public void soDoiXung() {
        int n = Nhap();
        if (n > 10) {
            System.out.print("Cac so doi xung <= n la: \n{");
            for (int i = 11; i <= n; i++) {
                if (kiemTraDoiXung(i) == true) {
                    System.out.print(+i + ";");
                }
            }
            System.out.print("\b}"); // xóa lùi
        } else {
            System.out.println("không có số đối xứng");
        }
    }
    public int Nhap() {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            try {
                do {
                    System.out.println("Nhap so nguyen duong(a>0):");
                    a = Integer.parseInt(sc.nextLine());
                   // a = sc.nextInt(); //dính phím Enter và bị trôi lệnh
                } while (a <= 0);
                break;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số:");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("3. Liet ke cac so doi xung nho hon bang so nguyen duong");
        so_DoiXung_Bai3 DX = new so_DoiXung_Bai3();
        DX.soDoiXung();
    }
}
