package 정렬;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
public class B1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        for(int i =0 ;i<N;i++){
            set.add(br.readLine());
        }
        String[] result = set.toArray(new String[0]);
        Arrays.sort(result, (s1, s2)->{
            if(s1.length() == s2.length()) return s1.compareTo(s2);
            else return s1.length() - s2.length();
        });
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<result.length;i++){
            sb.append(result[i]).append("\n");
        }
        System.out.print(sb);
    }
}
