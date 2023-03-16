package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(Fibo(N));
    }

    private static int Fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibo(n-1) + Fibo(n-2);
    }
}
