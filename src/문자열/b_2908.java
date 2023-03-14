package 문자열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        String result ="";
        for(int i=0;i<3;i++){
            if(num1.charAt(2-i) > num2.charAt(2-i)){
                result = num1;
                break;
            }
            else if(num1.charAt(2-i)< num2.charAt(2-i)){
                result = num2;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(result).reverse();
        System.out.println(sb);
    }
}
