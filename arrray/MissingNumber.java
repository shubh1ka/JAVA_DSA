package arrray;

public class MissingNumber {
        static class Solution {
            int missingNum(int arr[]) {
                int n = arr.length + 1;  // because one number is missing
                long expectedSum = (long) n * (n + 1) / 2;

                long actualSum = 0;
                for (int num : arr) {
                    actualSum += num;
                }

                return (int) (expectedSum - actualSum);
            }
        }

        // Main method to test your solution locally
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5};
            Solution sol = new Solution();
            int missing = sol.missingNum(arr);

            System.out.println("Missing number is: " + missing);
        }

}
