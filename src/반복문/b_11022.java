package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class b_11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int num1, num2;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0; i<T;i++){
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            sb.append("Case #" + (i+1) + ": " + num1 + " + " + num2 + " = " + (num1+num2)).append("\n");
        }
        System.out.println(sb);
    }
}
