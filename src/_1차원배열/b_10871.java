package _1차원배열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class b_10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int num;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            num = Integer.parseInt(st.nextToken());
            if(num < X)
                sb.append(num + " ");
        }
        System.out.println(sb);
    }
}
