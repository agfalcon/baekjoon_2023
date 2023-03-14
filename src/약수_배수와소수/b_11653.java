package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int i=2;
        while(N>1){
            if(N%i==0){
                sb.append(i).append("\n");
                N/=i;
            }
            else{
                i++;
            }
        }
        System.out.println(sb);
    }
}
