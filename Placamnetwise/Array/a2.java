package Placamnetwise.Array;

public class a2 {
    public void bets(int arr[]) {
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            int profit = max - arr[i];
            if (profit > maxprofit) {
                maxprofit = profit;
            }

        }
        System.out.println(maxprofit);

    }
}

class maia0a000nss {
    public static void main(String[] args) {
        a2 kw = new a2();
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        kw.bets(arr);

    }
}