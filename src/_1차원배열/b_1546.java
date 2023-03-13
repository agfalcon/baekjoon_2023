package _1차원배열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        int score[] = new int[N];
        for(int i=0;i<N;i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(max < score[i])
                max = score[i];
        }
        double sum = 0;
        for(int i=0;i<N;i++){
            sum += score[i]/(double)max*100;
        }
        System.out.println(sum/N);
    }
}
