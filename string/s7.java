package string;

import java.util.HashMap;

public class s7 {
    public void samee(int arr[], int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int sum = 0;
        int count = 0;
        map1.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map1.containsKey(sum - k)) {
                count += map1.get(sum - k);

            }

        }
        System.out.println(count);

    }

}

class main0221 {
    public static void main(String[] args) {
        s7 gtr11 = new s7();
        int arr[] = { 1, 2, 3, 4, 6, 4, 5, 4, 1 };
        gtr11.samee(arr, 10);

    }
}