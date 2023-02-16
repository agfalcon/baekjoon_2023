package 재귀;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_2447 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] canvas = new String[N];
        for(int i=0;i<canvas.length;i++){
            canvas[i] = "";
        }
        star(N, canvas, 0, N);
        for(int i=0;i<N;i++){
            System.out.println(canvas[i]);
        }
    }

    private static void star(int n, String[] canvas, int start, int end){
        if(n==3){
            canvas[start] = canvas[start] + "***";
            canvas[start+1] = canvas[start+1] + "* *";
            canvas[start+2] = canvas[start+2] + "***";
            return;
        }
        for(int i=0;i<3;i++){
            star(n/3, canvas, start, start + (end-start)/3);
        }
        star(n/3, canvas, start + (end-start)/3, start + 2*(end-start)/3);
        for(int i=start+n/3;i<start+2*n/3;i++){
            for(int j=0;j<n/3;j++){
                canvas[i] = canvas[i] + " ";
            }
        }
        star(n/3, canvas, start + (end-start)/3, start + 2*(end-start)/3);
        for(int i=0;i<3;i++){
            star(n/3, canvas, start + 2*(end-start)/3, end);
        }
    }
}
