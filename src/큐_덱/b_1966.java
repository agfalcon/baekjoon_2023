package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<T;i++){
            queue.clear();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            int list[] = new int[10];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                int temp = Integer.parseInt(st.nextToken());
                list[temp]++;
                queue.add(temp);
            }
            int count =0;
            while(true){
                boolean isPrint = true;
                int num = queue.remove();
                for(int j=num+1;j<10;j++){
                    if(list[j]>0){
                        queue.add(num);
                        if(index==0) index = queue.size()-1;
                        else index--;
                        isPrint = false;
                        break;
                    }
                }
                if(isPrint){
                    list[num]--;
                    count++;
                    if(index==0){
                        sb.append(count).append("\n");
                        break;
                    }
                    index--;
                }
            }
        }
        System.out.println(sb);
    }
}
