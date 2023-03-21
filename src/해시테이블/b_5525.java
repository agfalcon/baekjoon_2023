package 해시테이블;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_5525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<input.length();i++){
            char temp = input.charAt(i);
            if(temp=='I'){
                if(stack.isEmpty() || stack.peek()=='O'){
                    stack.add('I');
                }
                else{
                    int num = stack.size();
                    if(num>=2*N+1){
                        count += (num-2*N-1)/2 + 1;
                    }
                    stack.clear();
                    stack.add('I');
                }
            }
            else{
                if(stack.isEmpty()) continue;
                else if(stack.peek()=='O'){
                    int num = stack.size()-1;
                    if(num>=2*N+1){
                        count += (num-2*N-1)/2 + 1;
                    }
                    stack.clear();
                }
                else{
                    stack.add('O');
                }
            }
        }
        if(!stack.isEmpty()){
            if(stack.peek()=='O'){
                int num = stack.size()-1;
                if(num>=2*N+1){
                    count += (num-2*N-1)/2 + 1;
                }
            }
            else{
                int num = stack.size();
                if(num>=2*N+1){
                    count += (num-2*N-1)/2 + 1;
                }
            }
        }
        System.out.println(count);
    }
}
