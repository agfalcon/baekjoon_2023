package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_10828 {
    static int top;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] stack = new int[N];
        top=-1;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")){
                int value = Integer.parseInt(st.nextToken());
                push(stack, value);
            }
            else if(op.equals("pop")){
                sb.append(pop(stack)).append("\n");
            }
            else if(op.equals("size")){
                sb.append(size()).append("\n");
            }
            else if(op.equals("top")){
                sb.append(top(stack)).append("\n");
            }
            else if(op.equals("empty")){
                sb.append(empty()).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int empty(){
        if(top<0)
            return 1;
        else
            return 0;
    }
    private static int size(){
        return top+1;
    }

    private static int top(int stack[]){
        if(empty()==1)
            return -1;
        else
            return stack[top];
    }

    private static int pop(int stack[]){
        if(empty()==1) return -1;
        return stack[top--];
    }
    private static void push(int stack[], int value){
        stack[++top] = value;
    }
}
