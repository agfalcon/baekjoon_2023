package 입출력과사칙연산;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_10869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(num1 + num2).append("\n").append(num1 - num2).append("\n").append(num1 * num2).append("\n").append(num1 / num2).append("\n").append(num1%num2);
        System.out.println(sb);
    }
}
