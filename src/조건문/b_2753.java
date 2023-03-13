package 조건문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_2753 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int result = 0;
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                result = 0;
            }
            else{
                result = 1;
            }
        }
        System.out.println(result);
    }
}
