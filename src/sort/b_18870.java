package sort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashSet;


public class b_18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int list[] = new int[N];
        HashSet<Integer> sort = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
            sort.add(list[i]);
        }
        Integer arr[] = sort.toArray(new Integer[0]);
        Arrays.parallelSort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<N;i++){
            sb.append(Arrays.binarySearch(arr, list[i])).append(" ");
        }
        System.out.println(sb);

    }
}

