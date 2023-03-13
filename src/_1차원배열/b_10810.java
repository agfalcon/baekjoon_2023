package _1차원배열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class b_10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int basket[] = new int[N+1];
        int start, end, num;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            for(int j=start;j<=end;j++){
                basket[j] = num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            sb.append(basket[i]+ " ");
        }
        System.out.println(sb);
    }
}
