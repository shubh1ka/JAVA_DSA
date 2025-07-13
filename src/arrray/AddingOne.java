package arrray;

public class AddingOne {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {7,8,9,10,11,12};
        int [] c = new int[a.length+b.length];
        merge(c,a,b);
        for(int ele:c) System.out.println(ele+" ");

    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;

            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
    }
}
