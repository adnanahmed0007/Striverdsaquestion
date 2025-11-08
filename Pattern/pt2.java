
package Pattern;

public class pt2 {
    public void pattern(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {

            for (int k = 0; k < n / 2 + n - i; k++) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int s = 0; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            if (i == 0) {
                for (int s = 0; s < 3 * n; s++) {
                    if ((s >= i && s < n - i) || (s >= 2 * n + i && s < 3 * n - i)) {
                        System.out.print("*");
                    } else if (s == n || s == 2 * n - 1) {
                        System.out.print("@");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            } else {
                for (int s = 0; s < 3 * n; s++) {
                    if ((s >= i && s < n - i) || (s >= 2 * n + i && s < 3 * n - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }

}

class maubdee {
    public static void main(String[] args) {
        pt2 gte = new pt2();
        gte.pattern(7);
    }
}