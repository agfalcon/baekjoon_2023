package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2477 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());
        int smallW=0;
        int smallH=0;
        int maxW=0;
        int maxH=0;
        int prev=0;
        int prevLength=0;
        int startLength=0;
        int lastLength=0;
        for(int i=0;i<6;i++){
            st = new StringTokenizer(br.readLine());
            int direct = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            if(i==0) startLength = length;
            if(i==5) lastLength = length;
            if(i>0){
                if((direct==1 && prev==4)|| (direct==2 && prev==3)||(direct==3 && prev==1)|| (direct==4 && prev==2)){
                    smallH = length;
                    smallW = prevLength;
                }
            }
            if(direct==3 || direct==4){
                if(maxW<length) maxW=length;
            }
            if(direct==1 || direct==2){
                if(maxH<length) maxH=length;
            }
            prevLength = length;
            prev = direct;
        }
        if(smallW==0 && smallH==0){
            smallH = startLength;
            smallW = lastLength;
        }
        System.out.println((maxH*maxW-smallH*smallW)*K);
    }
}
