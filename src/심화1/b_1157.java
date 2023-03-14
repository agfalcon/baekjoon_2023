package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int alpha[] = new int['z'-'a'+1];
        for(int i=0;i<input.length();i++){
            char temp = input.charAt(i);
            if(temp>='a'){
                alpha[temp-'a']++;
            }
            else{
                alpha[temp-'A']++;
            }
        }
        int max = 0;
        int index =0;
        boolean isSame = false;
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]>max){
                max = alpha[i];
                index = i;
                isSame = false;
            }
            else if(alpha[i]==max){
                isSame = true;
            }
        }
        if(isSame){
            System.out.println("?");
        }
        else{
            System.out.println((char)('A'+index));
        }
    }
}
