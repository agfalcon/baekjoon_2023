package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int value = 1;
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            while(stack.isEmpty() || stack.peek()!=num){
                if(value>n){
                    System.out.println("NO");
                    return;
                }
                stack.push(value++);
                sb.append("+\n");
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
