package 약수_배수와소수_더빠르게;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        boolean sosu[] = new boolean[end+1];
        sosu[1] = true;
        for(int i=2;i<=Math.sqrt(end+1);i++){
            if(sosu[i])  continue;
            for(int j=2*i;j<=end;j+=i){
                sosu[j]  =true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<=end;i++){
            if(!sosu[i])
                sb.append(i).append("\n");

        }
        System.out.println(sb);
    }
}
