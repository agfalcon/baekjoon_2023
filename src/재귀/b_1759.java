package 재귀;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_1759 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean[] result = new boolean[(int)(max-min+1)];
        boolean[] temp = new boolean[(int)Math.sqrt(max)+1];
        ArrayList<Integer> sosu = new ArrayList<>();
        for(int i=2;i<temp.length;i++){
            if(temp[i])
                continue;
            for(int j=2*i;j<temp.length;j+=i){
                temp[j]= true;
            }
        }
        for(int i=2;i<temp.length;i++){
            if(!temp[i])
                sosu.add(i);
        }
        int count = 0;
        for(int i=0;i<sosu.size();i++){
            long num = (long) sosu.get(i) *sosu.get(i);
            long begin = (long)(num * Math.ceil((double)min/num));
            for(long j=begin;j<=max;j+=num){
                result[(int)(j-min)]=true;
            }
        }
        for(int i=0;i<result.length;i++){
            if(!result[i])
                count++;
        }
        System.out.println(count);
    }
}
