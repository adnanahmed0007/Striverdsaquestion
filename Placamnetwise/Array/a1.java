package Placamnetwise.Array;

public class a1 {
    public void swapa(int prices[]) {
        int maxprofit = 0;
        int Minprice = Integer.MAX_VALUE;
        for (int value : prices) {
            if (value < Minprice) {
                Minprice = value;// time to buy the stock
            } else {
                if (value - Minprice > maxprofit) {
                    maxprofit = value - Minprice;
                }
            }
        }
        System.out.println(maxprofit);

    }
}

class maia0an9ss {
    public static void main(String[] args) {
        a1 gtr = new a1();
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        gtr.swapa(arr);
    }
}