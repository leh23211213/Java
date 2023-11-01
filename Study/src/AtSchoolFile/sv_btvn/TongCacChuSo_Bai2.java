/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv_btvn;

import java.util.Scanner;

/**
 *
 * @author KHUONG
 */
public class TongCacChuSo_Bai2 {
    static int a;

    public int Nhap() {
        Scanner sc = new Scanner(System.in);
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

    public static int tongChuSo() {
        // a = 756;
        int b = 0, sum = 0;
        while (a > 0) {
            b = a % 10;
            sum += b;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        TongCacChuSo_Bai2 B2 = new TongCacChuSo_Bai2();
        B2.Nhap();
        System.out.println("Tổng các chữ số = " + tongChuSo());
    }
}
