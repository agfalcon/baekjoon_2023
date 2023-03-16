package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2485 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long prev = Integer.parseInt(br.readLine());
        long difference[] = new long[N-1];
        for(int i=0;i<N-1;i++){
            long num = Integer.parseInt(br.readLine());
            difference[i] = num-prev;
            prev = num;
        }
        long gcd = GCD(difference[0], difference[1]);
        for(int i=2;i<N-1;i++){
            gcd = GCD(gcd, difference[i]);
        }
        int count =0;
        for(int i=0;i<N-1;i++){
            count += difference[i]/gcd -1;
        }
        System.out.println(count);
    }
    private static long GCD(long num1, long num2){
        if(num1%num2==0) return num2;
        return GCD(num2, num1%num2);
    }

}
