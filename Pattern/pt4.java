package Pattern;

public class pt4 {
    public void psttern(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < n; k++) {
            for (int s = 0; s < n; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n / 2; s++) {
                System.out.print(" ");
            }
            if (i == 0) {
                for (int k = 0; k < n + 2; k++) {

                    System.out.print("*");

                }

            } else {
                for (int k = 0; k < n + 2; k++) {
                    if (k == 0 || k == n + 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int s = 0; s < 2 * n + 1; s++) {
                if ((s >= i && s < n - i) || (s > n + i && s <= 2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

class mibhj {
    public static void main(String[] args) {
        pt4 fre = new pt4();
        fre.psttern(7);
    }
}
