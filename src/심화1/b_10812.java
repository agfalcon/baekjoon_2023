package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10812 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int basket[] = new int[N+1];
        for(int i=1;i<basket.length;i++){
            basket[i] = i;
        }
        int start, end, mid;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            mid = Integer.parseInt(st.nextToken());
            rotate(start, end, mid, basket);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }

    private static void rotate(int start, int end, int mid, int[] basket){
        int temp[] = new int[end-start+1];
        int index=0;
        for(int i=mid;i<=end;i++){
            temp[index++] = basket[i];
        }
        for(int i = start;i<mid;i++){
            temp[index++] = basket[i];
        }
        for(int i=0;i<temp.length;i++){
            basket[i+start] = temp[i];
        }
    }
}
