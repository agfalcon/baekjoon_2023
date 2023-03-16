package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_4134 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        long max = 0;
        long list[] = new long[T];
        for(int i=0;i<T;i++){
            long n = Long.parseLong(br.readLine());
            if(max<n) max = n;
            list[i] = n;
        }

        boolean sosu[] = new boolean[(int) (Math.sqrt(max)+1)];
        sosu[0] = sosu[1] = true;
        for(int i=2;i<=Math.sqrt(sosu.length);i++){
            if(sosu[i]) continue;
            for(int j=2*i;j<sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        for(int i=0;i<T;i++){
            long n = list[i];
            while(true){
                boolean isSosu = true;
                for(int j=2;j<=Math.sqrt(n);j++){
                    if(!sosu[j] && n%j==0){
                        isSosu = false;
                        break;
                    }
                }
                if(isSosu) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);
    }
}
