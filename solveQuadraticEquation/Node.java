public class Node {
    public double data;
    public char ch;
    public Node next;

    public Node() {
    }

    public Node(double data, char ch) {
        this.data = data;
        this.ch = ch;
        this.next = null;
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.ch + "= " + head.data + "\t");
            head = head.next;
        }
        System.out.println();
    }
}