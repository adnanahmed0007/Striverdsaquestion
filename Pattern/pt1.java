package Pattern;

public class pt1 {
    public void patterrm(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int s = 0; s < n + n / 2 - i; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
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
        for (int s = 0; s < n / 2 + 1; s++) {

            for (int k = 0; k < 3 * n; k++) {
                if (s == 0) {
                    if ((k >= s && k < n - s) || (k >= 2 * n + s && k < 3 * n - s)) {
                        System.out.print("*");
                    } else if (k == n || k == 2 * n - 1) {
                        System.out.print("@");
                    }

                    else {
                        System.out.print(" ");
                    }

                } else {
                    if ((k >= s && k < n - s) || (k >= 2 * n + s && k < 3 * n - s)) {
                        System.out.print("*");
                    }

                    else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();
        }

    }

}

class maiqqqn {
    public static void main(String[] args) {
        pt1 jbdd = new pt1();
        int n = 5;
        jbdd.patterrm(n);
    }
}
