import java.util.Scanner;

public class Program {
    public static Node input() {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node current = null;
        char ch = 'A';
        while (true) {
            System.out.println(" input value of " + ch + " (or 99 to stop input): ");
            double value;
            try {
                value = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Erros! " + e + " ReInput a number " + ch);
                continue;
            }
            if (value == 99)
                break;
            Node newNode = new Node(value, ch);
            ch++;
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }
        sc.close();
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = input();
        head.printList(head);
        double a = 0, b = 0, c = 0;
        while (head != null) {
            if (head.ch == 'A') {
                a = head.data;
            }
            if (head.ch == 'B') {
                b = head.data;
            }
            if (head.ch == 'C') {
                c = head.data;
            }
            head = head.next;
        }
        SolveQuadraticEquation F = new SolveQuadraticEquation();
        F.solve(a, b, c);
        System.out.println("Press any key to continue...");
    }
}