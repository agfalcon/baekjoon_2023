package _1차원배열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class b_10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N  = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int num1, num2;
        int basket[] = new int[N+1];
        for(int i=1;i<=N;i++){
            basket[i] = i;
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            swap(num1, num2, basket);
        }
        for(int i=1;i<=N;i++){
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }

    private static void swap(int num1, int num2, int []basket){
        int temp = basket[num1];
        basket[num1] = basket[num2];
        basket[num2] = temp;
    }
}
