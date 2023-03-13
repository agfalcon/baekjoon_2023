package _1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        int temp;
        for(int i=0;i<N;i++){
            temp = Integer.parseInt(st.nextToken());
            if(num==temp)
                result++;
        }
        System.out.println(result);
    }
}
