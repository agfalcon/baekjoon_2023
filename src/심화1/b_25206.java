package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_25206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double score = 0;
        double subject = 0;
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double s = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();
            if(rank.equals("P")){
                continue;
            }
            score += getScore(s, rank);
            subject += s;
        }

        System.out.println(score/subject);
    }
    private static double getScore(double s, String rank){
        if(rank.equals("A+")){
            s = s * 4.5;
        }
        else if(rank.equals("A0")){
            s = s * 4.0;
        }
        else if(rank.equals("B+")){
            s = s * 3.5;
        }
        else if(rank.equals("B0")){
            s = s * 3.0;
        }
        else if(rank.equals("C+")){
            s = s * 2.5;
        }
        else if(rank.equals("C0")){
            s = s * 2.0;
        }
        else if(rank.equals("D+")){
            s = s * 1.5;
        }
        else if(rank.equals("D0")){
            s = s;
        }
        else if(rank.equals("F")){
            s = 0.0;
        }
        return s;
    }
}
