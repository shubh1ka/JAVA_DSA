package arrray;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] Words = {"flow", "flower", "Tintin"};
        String String1 = Words[0];
        String String2 = Words[1];
        String String3 = Words[2];
        String common_string="";
        int  min_string_len = String3.length();
        int second_smallest_string = Math.min(String1.length(),String2.length());
        if(second_smallest_string<String3.length()){
            min_string_len = second_smallest_string;
        }
        for(int i=0;i<min_string_len;i++){
            char c1 = Words[0].charAt(i);
            char c2 =Words[1].charAt(i);
            if(c1==c2){
                common_string=common_string+c1;
            }


        }System.out.println(common_string);
        int c=0;
        for(int j=0;j<common_string.length();j++){
            char c3 = Words[2].charAt(j);
            if(common_string.charAt(j)==c3){
                c=1;
            }

        }
        if(c==1){
            System.out.println("All three words have common prefix");
        }else{
            System.out.println("All three words do not have a common prefix");
        }


    }
}
