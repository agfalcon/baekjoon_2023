package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int time = 1;
        int index = 667;
        while(time!=N){
            if(String.valueOf(index).contains("666"))
                time++;
            index++;
        }
        System.out.println(index-1);
    }
}
