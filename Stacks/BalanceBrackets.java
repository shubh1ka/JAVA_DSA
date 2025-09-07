package Stacks;

import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {

    }static boolean isBalanced(String s){

        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('|| ch =='['||ch=='{'){
                st.push(ch);
            }
            else {//ch closing bracket hua toh
              if(st.size()==0) return false;
              char top = st.peek();
              if(sameStyle(top,ch)) st.pop();
              else return false;
            }

        }
        return (st.size()==0);
    }
    static boolean sameStyle(char a,char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;

    }
}
