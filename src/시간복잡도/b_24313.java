package 시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_24313 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        if(a1>c){
            System.out.println(0);
        }
        else if(a1 == c){
            if(a0<=0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            if(c*n>=a1*n+a0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
