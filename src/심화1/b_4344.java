package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<C;i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int score[] = new int[N];
            double sum = 0;
            for(int j=0;j<N;j++){
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            sum = sum/N;
            int student = 0;
            for(int j=0;j<N;j++){
                if(score[j]>sum){
                    student++;
                }
            }
            sb.append(String.format("%.3f", (double)student/N*100) + "%\n");
        }
        System.out.println(sb);
    }
}
