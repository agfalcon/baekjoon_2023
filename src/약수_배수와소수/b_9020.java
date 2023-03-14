package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9020 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean sosu[] = new boolean[10001];
        sosu[1] = true;
        for(int i=2;i<=Math.sqrt(10000);i++){
            if(sosu[i]) continue;;
            for(int j=i*2;j<=10000;j+=i){
                sosu[j] = true;
            }
        }
        for(int i=0;i<T;i++){
            int num = Integer.parseInt(br.readLine());
            for(int j=num/2;j>0;j--){
                if(!sosu[j] && !sosu[num-j]){
                    sb.append(j).append(" ").append(num - j).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
