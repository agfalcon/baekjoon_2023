package 문자열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b_11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println((int)input.charAt(0));
    }
}
