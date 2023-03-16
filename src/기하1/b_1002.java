package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            if(x1==x2 && y1==y2 && r1==r2){
                sb.append(-1).append("\n");
                continue;
            }
            if(distance < Math.max(r1,r2)){
                int max = Math.max(r1, r2);
                int min = Math.min(r1,r2);
                if(distance> max-min)
                    sb.append(2).append("\n");
                else if(distance==max-min)
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else{
                if(distance > r1+r2)
                    sb.append(0).append("\n");
                else if(distance== r1+r2)
                    sb.append(1).append("\n");
                else if(distance< r1+r2)
                    sb.append(2).append("\n");
            }
        }
        System.out.println(sb);
    }
}
