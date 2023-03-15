package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<String>[] member = new ArrayList[201];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            if(member[age]==null){
                member[age] = new ArrayList<>();
            }
            member[age].add(name);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<201;i++){
            if(member[i]!=null){
                for(int j=0;j<member[i].size();j++){
                    sb.append(i).append(" ").append(member[i].get(j)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
