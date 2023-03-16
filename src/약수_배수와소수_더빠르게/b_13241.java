package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_13241 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());
        long gcd = GCD(num1, num2);
        System.out.println(num1*num2/gcd);
    }
    private static long GCD(long num1, long num2){
        if(num1%num2==0) return num2;
        return GCD(num2, num1%num2);
    }
}
