package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2775 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int people[][] = new int[15][15];
        for(int i=0;i<T;i++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            sb.append(getNum(floor, room, people)).append("\n");
        }
        System.out.println(sb);
    }

    private static int getNum(int floor, int room, int[][] people){
        if(floor==0){
            return room;
        }
        if(people[floor][room]!=0)
            return people[floor][room];
        for(int i=1;i<=room;i++){
            people[floor][room] += getNum(floor-1, i, people);
        }
        return people[floor][room];
    }
}
