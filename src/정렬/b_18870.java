package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b_18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            num[i] =  Integer.parseInt(st.nextToken());
            map.put(num[i], 0);
        }
        Integer array[] = map.keySet().toArray(new Integer[0]);
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            map.put(array[i], i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(map.get(num[i])).append(" ");
        }
        System.out.println(sb);
    }
}
