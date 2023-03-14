package 시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_24267 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        long count = 0;
        for(int i=1;i<=n-2;i++){
            count += (long) (n - i) *(n-i-1)/2;
        }
        System.out.println(count);
        System.out.println(3);
    }
}
