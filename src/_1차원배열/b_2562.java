package _1차원배열;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class b_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = -1;
        int num;
        for(int i = 0; i<9;i++){
            num = Integer.parseInt(br.readLine());
            if(max < num){
                max = num;
                index = i+1;
            }
        }
        StringBuilder sb = new StringBuilder().append(max).append("\n").append(index);
        System.out.println(sb);
    }
}
