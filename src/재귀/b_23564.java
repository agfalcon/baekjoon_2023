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
        String[] temp;
        while (true) {
            int count[] = new int['z'-'a'+ 1];
            int min = Integer.MAX_VALUE;
            char index = '0';
            for(int i=0;i<input.length();i++){
                count[input.charAt(i)-'a']++;
            }
            for(int i=0;i<input.length();i++){
                if(count[input.charAt(i)-'a']==0)
                    continue;
                if(min>count[input.charAt(i)-'a']){
                    min = count[input.charAt(i)-'a'];
                    index = input.charAt(i);
                }
            }
            temp = input.split(Character.toString(index));
            if(temp.length==0){
                S.append(index);
                A.append(input.length());
                break;
            }
            else{
                A.append(temp.length-1).append(" ");
                S.append(index);
                input = temp[0];
            }
        }
        StringBuilder sb = S.reverse().append("\n").append(A.reverse());
        System.out.println(sb);
    }
}
