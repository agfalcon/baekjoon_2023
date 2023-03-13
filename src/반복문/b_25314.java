package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())/4;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N;i++){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
