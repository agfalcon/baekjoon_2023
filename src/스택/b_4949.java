package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_4949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        while(!(input=br.readLine()).equals(".")){
            stack.clear();
            boolean isVPS = true;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='(') stack.push('(');
                else if(input.charAt(i)=='[') stack.push('[');
                else if(input.charAt(i)==']'){
                    if(stack.isEmpty() || stack.pop()=='('){
                        isVPS = false;
                        break;
                    }
                }
                else if(input.charAt(i)==')'){
                    if(stack.isEmpty() || stack.pop()=='['){
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) isVPS = false;
            if(isVPS) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
