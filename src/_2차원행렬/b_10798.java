package _2차원행렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char array[][] = new char[5][15];
        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                array[i][j] = ' ';
            }
        }
        for(int i=0;i<5;i++){
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                array[i][j] = input.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(array[j][i] != ' '){
                    sb.append(array[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}
