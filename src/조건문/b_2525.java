package 조건문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        H+= time/60;
        M+= time%60;
        if(M>=60){
            H+=M/60;
            M= M%60;
        }
        if(H>=24){
            H-=24;
        }
        System.out.println(H + " " + M);
    }
}
