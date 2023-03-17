package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            boolean isVPS = true;
            String input = br.readLine();
            stack.clear();
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='(')
                    stack.push('(');
                else if(input.charAt(j)==')'){
                    if(stack.isEmpty()){
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }

            }
            if(!stack.isEmpty()) isVPS =false;
            if(isVPS) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
}
