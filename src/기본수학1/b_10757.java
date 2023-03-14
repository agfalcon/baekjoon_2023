package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10757 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = new StringBuilder().append(st.nextToken()).reverse().toString();
        String num2 = new StringBuilder().append(st.nextToken()).reverse().toString();
        int range = Math.min(num1.length(), num2.length());
        int upRange = Math.max(num1.length(), num2.length());
        int up =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<range;i++){
            int num = num1.charAt(i)-'0' + num2.charAt(i)-'0' + up;
            up = num/10;
            num%=10;
            sb.append(num);
        }
        for(int i=range;i<upRange;i++){
            int num;
            if(num1.length()>num2.length()){
                num = num1.charAt(i)-'0' + up;
            }
            else{
                num = num2.charAt(i)-'0' + up;
            }
            up = num/10;
            num%=10;
            sb.append(num);
        }
        if(up==1)
            sb.append(1);
        System.out.println(sb.reverse());
    }
}
