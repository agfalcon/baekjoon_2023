package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int num[] = new int[10];
        while(input>0){
            num[input%10]++;
            input/=10;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=9;i>=0;i--){
            for(int j=0;j<num[i];j++){
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
