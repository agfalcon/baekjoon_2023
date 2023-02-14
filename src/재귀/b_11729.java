package 재귀;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b_11729 {

    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Hannoi(sb, N, 1, 3);
        System.out.println(count);
        System.out.println(sb);
    }

    private static void Hannoi(StringBuilder sb, int N, int start, int end){
        if(N==1){
            sb.append(start).append(" ").append(end).append("\n");
            count++;
            return;
        }
        Hannoi(sb, N-1, start, 6-start-end);
        sb.append(start).append(" ").append(end).append("\n");
        count++;
        Hannoi(sb,N-1, 6-start-end, end);
    }
}

