package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int point[][] = new int[4][2];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            point[i][0] = x;
            point[i][1] = y;
        }
        StringBuilder sb = new StringBuilder();
        if(point[0][0] == point[1][0]){
            sb.append(point[2][0]).append(" ");
        }
        else if(point[0][0] == point[2][0]){
            sb.append(point[1][0]).append(" ");
        }
        else{
            sb.append(point[0][0]).append(" ");
        }
        if(point[0][1] == point[1][1]){
            sb.append(point[2][1]).append(" ");
        }
        else if(point[0][1] == point[2][1]){
            sb.append(point[1][1]).append(" ");
        }
        else{
            sb.append(point[0][1]).append(" ");
        }
        System.out.println(sb);
    }
}
