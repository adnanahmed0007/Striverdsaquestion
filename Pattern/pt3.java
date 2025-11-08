package Pattern;

public class pt3 {
    public void pattern(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int k = 0; k < n / 2 + i; k++) {
                System.out.print(" ");
            }
            for (int s = 2 * i + 1; s <= n; s++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int k = 0; k < n; k++) {
            if (k == 0) {
                for (int s = 0; s < n; s++) {

                    System.out.print("*");

                }
            } else {
                for (int s = 0; s < n; s++) {
                    if (s == 0 || s == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }

}

class maubnsw {
    public static void main(String[] args) {
        pt3 frw = new pt3();
        frw.pattern(5);
    }
}