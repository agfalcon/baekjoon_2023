package 문자열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b_9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String input;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            input = br.readLine();
            sb.append(String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length()-1))).append("\n");
        }
        System.out.println(sb);
    }
}
