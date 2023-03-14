package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int chess[] = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            chess[i] = chess[i] - num;
            sb.append(chess[i] + " ");
            i++;
        }
        System.out.println(sb);
    }
}
