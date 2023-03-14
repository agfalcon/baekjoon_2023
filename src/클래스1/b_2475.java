package 클래스1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            num += temp*temp;
        }
        System.out.println(num%10);
    }
}
