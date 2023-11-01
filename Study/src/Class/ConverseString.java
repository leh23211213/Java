import java.util.Scanner;

public class ConverseString {
    public static int countCharacterInString(String value) {
        int count = 0;
        char[] charValue = value.toCharArray();
        for (char c : charValue) {
            if (c == ' ')
                continue;
            else
                count++;
        }
        return count;
    }

    public static int countSC(String value) {
        int count = 0;
        char[] specialChars = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '\\', '-', '=', '[', ']',
                '{', '}', ';', ':', '\'', '\"', '\\', '|', ',', '.', '<', '>', '/', '?', ']' };
        char[] charValue = value.toCharArray();
        for (char c : charValue) {
            for (char specialChar : specialChars)
                if (c == specialChar)
                    count++;
        }
        return count;
    }

    public static String reverse(String value) {
        StringBuilder reversed = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            reversed.append(value.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập câu cần chạy chương trình hoặc nhập '-1' để thoát : ");
        int option;
        System.out.println("__MENU__");
        System.out.println("1 Đếm số lượng kí tự trong mảng");
        System.out.println("2 Đếm các kí tự đặc biệt");
        System.out.println("3 Đảo ngược chuỗi");
        System.out.println("4 Đảo các từ trong chuỗi");
        do {
            option = Integer.parseInt(sc.nextLine());
            String userInput = null;
            switch (option) {
                case 1:
                    System.out.println("Mời nhập chuỗi kí tự cần đếm: ");
                    userInput = sc.nextLine();
                    System.out.println("Số lượng kí tự là: " + countCharacterInString(userInput));
                    break;
                case 2:
                    System.out.println("Mời nhập chuỗi cần đếm kí tự đặc biệt:");
                    userInput = sc.nextLine();
                    System.out.println("Số lượng kí tự đặc biệt trong chuỗi là: " + countSC(userInput));
                    break;
                case 3:
                    System.out.println("Mời nhập chuỗi cần đảo ngược: ");
                    userInput = sc.nextLine();
                    System.out.println("Chuỗi sau khi đão ngược: " + reverse(userInput));
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (option != -1);
        sc.close();
    }

}