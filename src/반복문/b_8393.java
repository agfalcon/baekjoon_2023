package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=1;i<=n;i++){
            result +=i;
        }
        System.out.println(result);
    }
}
