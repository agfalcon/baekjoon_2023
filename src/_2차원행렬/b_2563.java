package _2차원행렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2563 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean square[][] = new boolean[100][100];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            for(int j=num2;j<num2+10;j++){
                for(int k=num1;k<num1+10;k++){
                    square[j][k] = true;
                }
            }
        }
        int area =0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(square[i][j])
                    area++;
            }
        }
        System.out.println(area);
    }
}
