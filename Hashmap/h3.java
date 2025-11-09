package Hashmap;

import java.util.Stack;

public class h3 {
    public void main1(int arr[]) {
        Stack<Integer> st1 = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i];
            while (!st1.isEmpty() && st1.peek() <= arr[i]) {
                st1.pop();

            }
            if (st1.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = st1.peek();
            }
            st1.push(cur);
        }
        for (int value : arr) {
            System.out.println(value);
        }
    }

}

class main99b {
    public static void main(String[] args) {
        h3 free = new h3();
        int arr[] = { 6, 8, 0, 1, 3 };
        free.main1(arr);
    }
}