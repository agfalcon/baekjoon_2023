package 입출력과사칙연산;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class b_2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int result1 = num1 * (num2%10);
        num2/=10;
        int result2 = num1 * (num2%10);
        num2/=10;
        int result3 = num1 * num2;
        int result4 = result3*100 + result2 * 10 + result1;
        StringBuilder sb = new StringBuilder();
        sb.append(result1).append("\n").append(result2).append("\n").append(result3).append("\n").append(result4);
        System.out.println(sb);
    }
}
