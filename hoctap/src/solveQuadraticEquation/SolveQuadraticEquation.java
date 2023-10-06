public class SolveQuadraticEquation {
    public SolveQuadraticEquation() {
    }

    public void solve(double a, double b, double c) {
        double delta;
        if (a == 0 && b == 0) {
            if (c == 0)
                System.out.println("PTVSN");
            else
                System.out.println("PTVN");
        } else if (a == 0) {
            System.out.println("phương trình có một nghiệm là -c/b =" + (-c / b));
        } else {
            delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = -b + Math.sqrt(delta) / (2 * a);
                double x2 = -b - Math.sqrt(delta) / (2 * a);
                System.out.println("phương trình có hai nghiệm x1: " + x1);
                System.out.println("phương trình có hai nghiệm x2: " + x2);
            } else if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("phương trình có một nghiệm là -b/2a=" + (-b / 2 * a));
            }
        }
    }
}