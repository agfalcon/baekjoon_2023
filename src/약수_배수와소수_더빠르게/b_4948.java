package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_4948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean sosu[] = new boolean[2*123456+1];
        sosu[0] = sosu[1] = true;
        for(int i=2;i<=Math.sqrt(sosu.length);i++){
            if(sosu[i]) continue;
            for(int j=i*2;j<sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int count = 0;
            for(int i=n+1;i<=2*n;i++){
                if(!sosu[i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
