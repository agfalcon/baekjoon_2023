package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String temp = new StringBuilder().append(input).reverse().toString();
        if(input.equals(temp)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
