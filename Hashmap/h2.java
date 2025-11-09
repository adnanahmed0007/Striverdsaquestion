package Hashmap;

import java.util.HashMap;

public class h2 {
    public void arra1(int arr[], int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int sum = 0;
        map1.put(0, -1);
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map1.containsKey(sum - k)) {
                int prevIndex = map1.get(sum - k);
                int len = i - prevIndex;
                if (len > maxlen) {
                    maxlen = len;
                }

            }
            if (!map1.containsKey(sum)) {
                map1.put(sum, i);
            }

        }
        System.out.println(maxlen);

    }

}

class mainw111ww {
    public static void main(String[] args) {
        h2 gtw = new h2();
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 2, 10, 9, 1 };
        gtw.arra1(arr, 10);
    }
}