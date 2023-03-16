package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_17103 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean sosu[] = new boolean[1000001];
        sosu[0] = sosu[1] = true;
        for(int i=2;i<=Math.sqrt(sosu.length);i++){
            if(sosu[i]) continue;
            for(int j=2*i;j<sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            int num = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j=2;j<=num/2;j++){
                if(!sosu[j] && !sosu[num-j]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
