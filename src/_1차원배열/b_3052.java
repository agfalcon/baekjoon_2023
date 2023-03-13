package _1차원배열;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class b_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean number[] = new boolean[42];
        for(int i=0;i<10;i++){
            number[Integer.parseInt(br.readLine())%42] = true;
        }
        int result = 0;
        for(int i=0;i<number.length;i++){
            if(number[i])
                result++;
        }
        System.out.println(result);
    }
}
