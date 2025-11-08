
package ArrayList;

import java.util.ArrayList;

public class al8 {
    public void lonsget(int num) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int k = 2;
        int k1 = 1;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                list1.add(k);
                k = k + 2;

            } else {
                list1.add(k1);
                k1 = k1 + 2;

            }

        }
        System.out.println(list1);

    }

}

class main0sdwwwwwww {
    public static void main(String[] args) {
        al8 hu = new al8();
        int h = 15;
        hu.lonsget(h);

    }
}