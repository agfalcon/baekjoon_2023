package _1차원배열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int basket[] = new int[N+1];
        for(int i=1;i<=N;i++){
            basket[i] = i;
        }
        int start, end;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            for(int j=start; j<= (start+end)/2;j++){
                swap(j, end-j+start, basket);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }
    private static void swap(int num1, int num2, int[] array){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}
