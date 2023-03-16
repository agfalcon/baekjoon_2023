package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int gcd = GCD(num1, num2);
            sb.append(num1*num2/gcd).append("\n");
        }
        System.out.println(sb);
    }

    private static int GCD(int num1, int num2){
        if(num1%num2==0) return num2;
        return GCD(num2, num1%num2);
    }
}
