package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            StringBuilder temp = new StringBuilder();
            temp.append(n + " = ");
            if(n==-1)
                break;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    result+=i;
                    temp.append(i + " + ");
                }
                if(result>n){
                    break;
                }
            }
            if(result==n){
                sb.append(temp.substring(0,temp.length()-3)).append("\n");
            }
            else{
                sb.append(n + " is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}
