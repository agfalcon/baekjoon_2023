package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] word = new String[N];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            word[i] = br.readLine();
        }
        Arrays.sort(word, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }
            }
        });

        for(int i=0; i<N;i++){
            if(i>0 && word[i].compareTo(word[i-1])==0)
                continue;
            sb.append(word[i]).append("\n");
        }
        System.out.println(sb);
    }
}
