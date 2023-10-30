/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv_btvn;

import java.util.Scanner;
import java.util.StringTokenizer;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author KHUONG
 */
public class Chuoi_Bai6 {

    static String st;

    static String nhapChuoi() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhập chuỗi văn bản: ");;
        st = kb.nextLine();
        return st;
    }

    static int demKyTu() {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                dem++;
            }
        }
        return dem;

    }

    static int demTu() {
        int word = 0;
        if (st.charAt(0) != ' ') {
            word = 1;
        }
        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) == ' ' && st.charAt(i + 1) != ' ') {
                word++;
            }
        }
        return word;
              //Cách 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" mời nhập vào chuỗi");
//        String chuoi = sc.nextLine();
//        StringTokenizer chuoi1 = new StringTokenizer(chuoi);
//        int sotutrongchuoi = chuoi1.countTokens();
//        System.out.println(" số từ trong chuỗi là: " + sotutrongchuoi);
    }

    public static void demKyTuDacBiet() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Moi nhap vao chuoi ky tu dac biet");
        String chuoi = sc.nextLine();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char kytu = chuoi.charAt(i);
            if (Character.isLetter(kytu) && !Character.isDigit(kytu) && !Character.isWhitespace(kytu)) {
                count++;
            }
        }
        System.out.println("Có " + count + " ký tự đặc biệt");
    }

    public static void nghichDao() {
        System.out.println("\n *** CHUONG TRINH IN CHUOI NGUOC *** ");
        try {
            System.out.println("\n *** Nhap chuoi:");
            //  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            // Class BufferedReader cho phép đọc text từ luồng nhập ký 	
            //tự, tạo bộ đệm cho những ký tự để hỗ trợ cho việc đọc 	
            //những ký tự, những mảng hay những dòng.
            // Doc 1 dong tu BufferReadered ket thuc bang dau ket thuc dong.
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            // String str = in.readLine();
            // System.out.println("\n Chuoi vua nhap là:" + str);
            System.out.println("\n Chuoi vua nhap là: " + S);
            // Xuat chuoi nghich dao
            System.out.println("\n Chuoi nghich dao la:");
            //  for (int i=str.length()-1; i>=0; i--)
            for (int i = S.length() - 1; i >= 0; i--) {
                //System.out.print(str.charAt(i));
                System.out.print(S.charAt(i));
            }
        } //catch (IOException e)
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
        public static void daoNguocCacTuTrongChuoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Mời nhập vào các từ : ");

        String chuoi = sc.nextLine();
        String[] mangTu = chuoi.split(" ");
        String chuoiDaoNguoc = "";

        for (int i = mangTu.length - 1; i >= 0; i--) {
            chuoiDaoNguoc += mangTu[i] + " ";
        }

        System.out.print(" Các từ sau khi đảo ngược là:\n " + chuoiDaoNguoc);
    }
    
    public static void main(String[] args) {
        nhapChuoi();
        System.out.println("Chuỗi " + st + " có " + demKyTu() + " ký tự");
        System.out.println("Chuỗi " + st + " có " + demTu() + " từ");
        demKyTuDacBiet();
        nghichDao();
        daoNguocCacTuTrongChuoi();
    }
}
