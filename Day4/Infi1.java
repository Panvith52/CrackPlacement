import java.util.Stack;

public class Infi1 {
    public static void main(String[] args) {
        String s = "110100";
        System.out.println(Sample1(s));
    }
    public static String Sample1(String S){
        Stack<Character> stack = new Stack<>();
        
        for (char c : S.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() == '1' && c == '0') {
                stack.pop();
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
