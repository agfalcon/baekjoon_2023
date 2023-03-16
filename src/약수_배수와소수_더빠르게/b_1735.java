package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1735 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long son1 = Integer.parseInt(st.nextToken());
        long mom1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long son2 = Integer.parseInt(st.nextToken());
        long mom2 = Integer.parseInt(st.nextToken());
        long gcd = GCD(mom1, mom2);
        long mom = mom1*mom2/gcd;
        long son = son1 * mom/mom1 + son2 * mom/mom2;
        gcd = GCD(mom, son);
        son/=gcd;
        mom/=gcd;
        System.out.println(son + " " + mom);
    }
    private static long GCD(long num1, long num2){
        if(num1%num2==0) return num2;
        return GCD(num2,num1%num2);
    }
}
