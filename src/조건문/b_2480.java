package 조건문;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class b_2480 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        if(num1 == num2 && num2==num3){
            System.out.println(10000 + num1*1000);
        }
        else if(num1==num2){
            System.out.println(1000 + num1*100);
        }
        else if(num2==num3){
            System.out.println(1000 + num2*100);
        }
        else if(num1==num3){
            System.out.println(1000 + num1*100);
        }
        else{
            if(num1>num2 && num1> num3){
                System.out.println(100 * num1);
            }
            else if(num2>num3){
                System.out.println(100 * num2);
            }
            else{
                System.out.println(100 * num3);
            }
        }
    }
}
