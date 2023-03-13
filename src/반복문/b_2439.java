package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                sb.append(" ");
            }
            for(int j=0;j<i+1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
