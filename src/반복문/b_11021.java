package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class b_11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            sb.append("Case #" + (i+1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
        }
        System.out.println(sb);
    }
}
