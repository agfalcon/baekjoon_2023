package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b_1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> person = new HashSet<>();
        for(int i=0;i<N;i++){
            person.add(br.readLine());
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<M;i++){
            String name = br.readLine();
            if(person.contains(name)){
                result.add(name);
                count++;
            }
        }
        Collections.sort(result);
        System.out.println(count);
        for(int i=0;i<count;i++){
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
