package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num[] = new int[8001];
        int sum = 0;
        int min = 4001;
        int max = -4001;
        int array[] = new int[N];
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(br.readLine());
            num[temp+4000]++;
            sum+=temp;
            if(min>temp) min = temp;
            if(max<temp) max = temp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((int)Math.round((double)sum/N)).append("\n");
        int value = 0;
        int index =0;
        int most = 0;
        boolean isSame = false;
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                if(most<num[i]){
                    most = num[i];
                    isSame = false;
                    value = i-4000;
                }
                else if(most==num[i]){
                    if(!isSame){
                        most = num[i];
                        value = i-4000;
                        isSame=true;
                    }
                }
                for(int j=0;j<num[i];j++){
                    array[index++] = i-4000;
                }
            }
        }
        sb.append(array[array.length/2]).append('\n');
        sb.append(value).append("\n");
        sb.append(max-min).append("\n");
        System.out.println(sb);
    }
}
