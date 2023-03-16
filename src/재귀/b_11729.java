package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11729 {
    static int K = 0;
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       Hanoi(N, 1, 3, sb);
       System.out.println(K);
       System.out.println(sb);
   }
   private static void Hanoi(int n, int start, int dest, StringBuilder sb){
       if(n==1){
           K++;
           sb.append(start).append(" ").append(dest).append("\n");
           return;
       }
       Hanoi(n-1, start, (6-start-dest), sb);
       K++;
       sb.append(start).append(" ").append(dest).append("\n");
       Hanoi(n-1,(6-start-dest), dest, sb);
   }
}
