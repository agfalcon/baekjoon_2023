package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0) stack.pop();
            else stack.push(num);
        }
        int count = 0;
        while(!stack.isEmpty()){
            count += stack.pop();
        }
        System.out.println(count);
    }
}
