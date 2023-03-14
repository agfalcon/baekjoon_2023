package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if(num1 ==0 && num2==0)
                break;
            if(num1%num2==0)
                sb.append("multiple\n");
            else if(num2%num1==0)
                sb.append("factor\n");
            else
                sb.append("neither\n");
        }
        System.out.println(sb);
    }
}
