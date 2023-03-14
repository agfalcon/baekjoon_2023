package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int n=1;
        int start=1;
        while(true){
            if(X<=n*(n+1)/2){
                break;
            }
            start = n*(n+1)/2+1;
            n++;
        }
        if(n%2==0){
            System.out.println((X-start+1)+"/"+(n-X+start));
        }
        else{
            System.out.println((n-X+start)+"/"+(X-start+1));
        }
    }
}
