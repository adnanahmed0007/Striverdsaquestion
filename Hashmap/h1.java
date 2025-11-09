package Hashmap;

import java.util.HashMap;

public class h1 {
    public void arra(int arr[], int k) {
        int count = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int sum = 0;
        map1.put(0, 1);

        for (int value : arr) {
            sum += value;

            if (map1.containsKey(sum - k)) {
                count += map1.get(sum - k);
            }
            if (map1.containsKey(sum)) {
                int h = map1.get(sum);
                map1.put(sum, h + 1);
            } else {
                map1.put(sum, 1);
            }

        }
        System.out.println(count);

    }

}

class mainwww {
    public static void main(String[] args) {
        h1 gtw = new h1();
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 2, 10, 9, 1 };
        gtw.arra(arr, 10);
    }
}