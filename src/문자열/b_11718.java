package 문자열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_11718 {
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input;
       StringBuilder sb = new StringBuilder();
       while((input=br.readLine())!=null){
           sb.append(input).append("\n");
       }
       System.out.println(sb);
   }
}
