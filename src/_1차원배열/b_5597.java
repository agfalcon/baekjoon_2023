package _1차원배열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class b_5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean student[] = new boolean[31];
        for(int i=0;i<28;i++){
            student[Integer.parseInt(br.readLine())] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<31;i++){
            if(!student[i])
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
