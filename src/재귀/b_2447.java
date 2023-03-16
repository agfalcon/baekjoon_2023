package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2447 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] star = new String[N];
        for(int i=0;i<N;i++){
            star[i] = "";
        }
        makeStar(N ,0, N-1, star);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(star[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void makeStar(int n, int start, int end, String[] star){
        if(n==3){
            star[start] = star[start] + "***";
            star[start+1] = star[start+1] + "* *";
            star[start+2] = star[start+2] + "***";
            return;
        }
        for(int i=0;i<3;i++){
            makeStar(n/3, start, start+n/3, star);
        }
        makeStar(n/3, start+n/3, start+2*n/3,star);
        for(int i=start+n/3;i<start+2*n/3;i++){
            for(int j=0;j<n/3;j++){
                star[i] = star[i] + " ";
            }
        }
        makeStar(n/3, start+n/3, start+2*n/3,star);
        for(int i=0;i<3;i++){
            makeStar(n/3, start+2*n/3, end, star);
        }
    }
}
