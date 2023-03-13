package 조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class b_2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(M>=45){
            M-=45;
        }
        else{
            H-=1;
            M = M + 15;
        }
        if(H<0){
            H+=24;
        }
        System.out.println(H + " " + M);
    }
}
