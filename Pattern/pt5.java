package Pattern;

public class pt5 {
    public void pattern(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int k = 0; k <= 2 * n; k++) {

            }
            System.out.println();
        }
    }
}

class maubsww {
    public static void main(String[] args) {
        pt5 fse = new pt5();
        int n = 5;
        fse.pattern(n);
    }
}
