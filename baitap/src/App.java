import java.util.Scanner;

public class App {
    public static void nhapMang(int[] chuoi, int dodai) {
        System.out.println("Mời nhập mảng :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dodai;) {
            try {
                chuoi[i] = Integer.parseInt(sc.nextLine());
                i++;
            } catch (Exception e) {
                System.out.println("Nhập lại số nhập sai: ");
                continue;
            }
        }
    }

    public static void soLe(int[] chuoi, int dodai) {
        System.out.println("Các số lẻ trong mảng: ");
        for (int i = 0; i < dodai; i++) {
            if (chuoi[i] % 2 != 0) { // Kiểm tra số lẻ
                System.out.print(chuoi[i] + " ");
            }
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }

    public static boolean checkNguyento(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void soNguyenTo(int[] chuoi, int dodai) {
        System.out.println("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < dodai; i++) {
            if (checkNguyento(chuoi[i])) {
                System.out.print(chuoi[i] + " ");
            }
        }
    }

    public static void demSoLe(int[] chuoi, int dodai) {
        int dem = 0;
        for (int i = 0; i < dodai; i++) {
            if (chuoi[i] % 3 == 1) {
                dem++;
            }
        }
        System.out.print("Số lượng số lẻ  trong mảng là: " + dem);
    }

    public static void demSoNguyenTo(int[] chuoi, int dodai) {
        int dem = 0;
        for (int i = 0; i < dodai; i++) {
            if (checkNguyento(chuoi[i])) {
                dem++;
            }
        }
        System.out.print("Số lượng số nguyên tố trong mảng là: " + dem);
    }

    public static void sapxep(int[] chuoi, int dodai) {
        for (int i = 0; i < dodai - 1; i++) {
            for (int j = 0; j < dodai - i - 1; j++) {
                if (chuoi[j] > chuoi[j + 1]) {
                    int temp = chuoi[j];
                    chuoi[j] = chuoi[j + 1];
                    chuoi[j + 1] = temp;
                }
            }
        }
        System.out.println("Chuỗi sau khi sắp xếp:");
        for (int i = 0; i < dodai; i++) {
            System.out.println(chuoi[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chuoi;
        System.out.println("Nhập độ dài mảng: ");
        int dodai = Integer.parseInt(sc.nextLine());
        chuoi = new int[dodai];
        nhapMang(chuoi, dodai);
        soLe(chuoi, dodai);
        soNguyenTo(chuoi, dodai);
        // demSole(chuoi, dodai);
        // demSonguyenTo(chuoi, dodai);
        sapxep(chuoi, dodai);
        sc.close();
    }
}
