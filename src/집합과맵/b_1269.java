package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b_1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<A;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<B;i++){
            int num = Integer.parseInt(st.nextToken());
            if(set.contains(num)) count++;
            else set.add(num);
        }
        System.out.println(set.size()-count);
    }
}
