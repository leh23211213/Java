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
public class UCLN_Bai4 {
     public static int Nhap(char i) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Mời nhập số " + i);
        while (true) {
            try {
                    a = Integer.parseInt(sc.nextLine());
                   // a = sc.nextInt(); //dính phím Enter và bị trôi lệnh
                break;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số cho số " + i);
            }
        }
        return a;
    }
     public static int UCLN(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
     }
    public static void main(String[] args) {
        int m = Nhap('m');
        int n = Nhap('n');
        System.out.println("Ước chung lớn nhất là " + UCLN(m, n));
    }
}
