package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char chess[][] = new char[N][M];
        for(int i=0;i<N;i++){
            String input  = br.readLine();
            for(int j=0;j<M;j++){
                chess[i][j] = input.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=N-8;i++){
            for(int j=0;j<=M-8;j++){
                int minB = 0;
                int minW = 0;
                for(int row=i;row<i+8;row++){
                    for(int col=j;col<j+8;col++){
                        if((row+col)%2==0){
                            if(chess[row][col]=='W'){
                                minB++;
                            }
                            else{
                                minW++;
                            }
                        }
                        else{
                            if(chess[row][col]=='W'){
                                minW++;
                            }
                            else{
                                minB++;
                            }
                        }
                    }
                }
               if(min>Math.min(minW,minB)){
                   min = Math.min(minW,minB);
               }
            }
        }
        System.out.println(min);
    }
}
