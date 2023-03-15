package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b_1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            String name = br.readLine();
            map.put(name, i+1);
            list.add(name);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            String q = br.readLine();
            if(q.charAt(0)>='A' && q.charAt(0)<='Z'){
                sb.append(map.get(q)).append("\n");
            }
            else{
                sb.append(list.get(Integer.parseInt(q)-1)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
