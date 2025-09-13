package Stacks;

public class ValidParentheses {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                // Push opening brackets
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                // Handle closing brackets
                else {
                    if (stack.isEmpty()) return false; // no matching opener

                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            // Valid if no unclosed brackets remain
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String s = "()[{}]";
            System.out.println(isValid(s));  // true
        }
}


