package ArrayList;

import java.util.Collections;
import java.util.PriorityQueue;

public class al7 {
    public void lagets(int arr[], int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int value : arr) {
            que.add(value);
        }
        int count = 1;
        while (!que.isEmpty()) {
            if (count < k) {

                que.poll();
                count++;
            } else if (count == k) {
                System.out.println(que.poll());
                break;
            }

        }

    }

}

class main0sdww {
    public static void main(String[] args) {
        al7 jkd = new al7();
        int arr[] = { 1, 7, 9, 10, 6, 5 };
        jkd.lagets(arr, 3);
    }
}
