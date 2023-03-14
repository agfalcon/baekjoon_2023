package 문자열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String input = br.readLine();
        for(int i=0;i<N;i++){
            sum += (int)input.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
