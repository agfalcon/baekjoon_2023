package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        N-=1;
        int result =1;
        int up = 0;
        int scale = 6;
        while(true){
            if(N<=up){
                break;
            }
            result++;
            up += scale;
            scale += 6;
        }
        System.out.println(result);
    }
}
