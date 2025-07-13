package arrray;

public class missingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        long n = arr.length;
        long sum= (n*(n+1))/2;
        int arraysum=0;
        for(int ele:arr){
            arraysum +=ele;
        }
//        int final1 = sum-arraysum;
//        System.out.println(final1);

    }
}
