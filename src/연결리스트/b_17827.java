package 연결리스트;

import java.io.*;
import java.util.StringTokenizer;

public class b_17827 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int list[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<M;i++){
            int num = Integer.parseInt(br.readLine());
            if(num<N) bw.write(list[num] +"\n");
            else bw.write(list[(num-V+1)%(N-V+1) + V-1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
