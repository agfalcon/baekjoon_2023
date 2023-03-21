package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        Stack<Integer[]> stack = new Stack<>();
        int list[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && stack.peek()[0]<num){
                list[stack.pop()[1]] = num;
            }
            stack.add(new Integer[]{num, i});
        }
        while(!stack.isEmpty()){
            list[stack.pop()[1]] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(list[i]).append(" ");
        }
        System.out.println(sb);
    }
}
