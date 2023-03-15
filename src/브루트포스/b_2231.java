package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1;i<=num;i++){
            int sum = i;
            int temp = i;
            while(temp>0){
                sum += temp%10;
                temp/=10;
            }
            if(sum==num){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
