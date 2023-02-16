package 재귀;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b_23564 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder S = new StringBuilder();
        StringBuilder A = new StringBuilder();
        while (true) {
            char index='0';
            int split;
            int i=2;
            while(true){
                split= (input.length()+1)/i-1;
                if(split==0){
                    index = input.charAt(0);
                    break;
                }
                if(split*2+1>input.length()){
                    continue;
                }
                if(input.substring(0,split).equals(input.substring(split+1, split+1+split))){
                    index = input.charAt(split);
                    break;
                }
                i++;
            }
            if(split==0){
                S.append(index);
                A.append(input.length());
                break;
            }
            else{
                A.append((input.length()+1)/(split+1)-1).append(" ");
                S.append(index);
                input = input.substring(0, split);
            }
        }
        StringBuilder sb = S.reverse().append("\n").append(A.reverse());
        System.out.println(sb);
    }
}
