package 클래스1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A= Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result= A*B*C;
        int num[] = new int[10];
        while(result>0){
            num[result%10]++;
            result/=10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(num[i]).append("\n");
        }
        System.out.println(sb);
    }
}
