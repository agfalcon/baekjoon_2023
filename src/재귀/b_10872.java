package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i=2;i<=N;i++){
            result*=i;
        }
        System.out.println(result);
    }
}
