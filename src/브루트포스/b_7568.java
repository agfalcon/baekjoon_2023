package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int person[][] = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<N;i++){
            int rank = 0;
            for(int j=0;j<N;j++){
                if(person[i][0] < person[j][0] && person[i][1] < person[j][1]){
                    rank++;
                }
            }
            sb.append(rank+1).append(" ");
        }
        System.out.println(sb);
    }
}
