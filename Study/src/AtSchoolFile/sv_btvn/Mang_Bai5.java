/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv_btvn;

/**
 *
 * @author KHUONG
 */
public class Mang_Bai5 {

    public static void demLe() {
        int dem = 0;
        System.out.println("5.1 Các số lẻ là");
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 != 0)
            {
                System.out.println(A[i]);
                dem++;
            }
        System.out.println("5.1 Số lượng phần tử lẻ là: " + dem); 
    }
    public static void NguyenTo(){
         System.out.println("\n5.2 Các số nguyên tố có trong mảng là: ");
            boolean kiemTra = true;
            int demNT = 0; 
            for (int i = 0; i < A.length; i++)
            {
                if (A[i] == 0 || A[i] == 1) kiemTra = false;
                if (A[i] == 2 || A[i] == 3) kiemTra = true;
                for (int j = 2; j <= Math.sqrt(A[i]); j++) // kiểm tra từng giá trị trong mảng
                {
                    if (A[i] % j == 0)
                    {
                        kiemTra = false;                                        
                        break;
                    }
                    else
                    {
                        kiemTra = true; 
                    }
                }
                if (kiemTra)   //tương đương với kiemtra == true
                {
                    System.out.println(A[i] + "  ");
                    demNT++;
                }
            }
            System.out.println("5.2 Số lượng số nguyên tố trong mảng là: " + demNT);
    }
    public static void TongLienTiepMax(){
        int so1 = 0;
        int so2 = 0;
        System.out.println("\n5.3 Tim 2 phan tu lien tiep co tong lon nhat");
        int max = A[0] + A[1];
        for (int i = 1; i < (A.length - 1); i++) {
            if (max < A[i] + A[i + 1]) {
                max = A[i] + A[i + 1];
                so1 = A[i];
                so2 = A[i + 1];
            }
        }
        System.out.println("5.3 Hai phan tu lien tiep co tong lon nhat la:" + so1 + " va " + so2);
    }
     public static boolean kiemTraDoiXung(int x) {
        int s = 0;
        int t = x;
        if (x <= 10) {
            return false;
        }
        while (x > 0) {
            s = s * 10 + x % 10;
            x = x / 10;
        }
        return s == t;
    }
      public static void tbcSDXung(int[] arr) {
        double tong = 0;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraDoiXung(arr[i]) == true) {
                tong += arr[i];
                dem++;
            }
        }
        double tbc = tong / dem;
        System.out.println("\n5.4 TBC cac so doi xung la = " + tong + " / " + dem + " = " + tbc);
    }
    static int[] A = new int[]{2,121, 3, 14, 5, 10, 21, 12, 13, 55, 1, 91, 15, 46, 48, 35, 37};
    public static void main(String[] args) {
        demLe();
        NguyenTo();
        TongLienTiepMax();
        tbcSDXung(A);
    }
}
