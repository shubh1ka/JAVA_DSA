package searchh;

public class two_sum {
    public static void main(String[] args) {
        int[] arr = {1, -3, 5, 6};
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                arr[i] = max;

            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > smax && arr[j] != max) {
                smax = arr[j];
            }
        }
        System.out.println(smax);

    }
}


