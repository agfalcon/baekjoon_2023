package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class b_10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num1, num2;
        String input;
        while((input = br.readLine())!= null){
            st = new StringTokenizer(input);
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            sb.append(num1 +num2).append("\n");
        }
        System.out.println(sb);
    }
}
