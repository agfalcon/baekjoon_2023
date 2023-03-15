package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int num[][] = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            num[i][0] = x;
            num[i][1] = y;
        }
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1] - o2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(num[i][0]).append(" ").append(num[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
