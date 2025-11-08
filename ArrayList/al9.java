package ArrayList;

public class al9 {
    public void zer(int arr[]) {
        int i = arr.length - 1;
        int j = i - 1;
        while (j >= 0) {
            if (arr[i] == 0 && arr[j] != 0) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i--;
                j--;

            } else if (arr[i] != 0 && arr[j] == 0) {
                i--;
                j--;
            } else {

                j--;
            }
        }
        for (int value : arr) {
            System.out.println(value);
        }

    }
}

class ma8insee {
    public static void main(String[] args) {
        al9 gte = new al9();
        int arr[] = { 0, 1, 0, 8, 9, 0, 9, 0, 0, };
        gte.zer(arr);
    }
}
