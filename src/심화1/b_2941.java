package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int length = input.length();
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)=='='){
                if(input.charAt(i-1)=='c' || input.charAt(i-1)=='s' || input.charAt(i-1)=='z'){
                    length--;
                    if(i>1 && input.charAt(i-1)=='z' && input.charAt(i-2)=='d'){
                        length--;
                    }
                }
            }
            else if(input.charAt(i)=='-'){
                if(input.charAt(i-1)=='c' || input.charAt(i-1)=='d'){
                    length--;
                }
            }
            else if(input.charAt(i)=='j'){
                if(input.charAt(i-1)=='l' || input.charAt(i-1)=='n'){
                    length--;
                }
            }
        }
        System.out.println(length);
    }
}
