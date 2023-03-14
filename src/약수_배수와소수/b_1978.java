package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean number[] = new boolean[1001];
        number[1] = true;
        for(int i=2;i<Math.sqrt(1000);i++){
            if(number[i]==true)
                continue;
            for(int j = i*2;j<1001;j+=i){
                number[j] = true;
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(!number[num]){
                count++;
            }
        }
        System.out.println(count);
    }
}
