package 클래스1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine(), "X");
            int sum = 0;
            while(st.hasMoreTokens()){
                String temp = st.nextToken();
                sum += temp.length()*(temp.length()+1)/2;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
