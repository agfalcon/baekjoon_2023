package sort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_2170 {
    static int sort[][];
    static int point[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sort = new int[N][2];
        point = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0, N-1);
        int dest = point[0][1];
        int start = point[0][0];
        int length = 0;


        for(int i=1;i<N;i++){
            if(point[i][0] <=dest && point[i][1]<=dest){
                continue;
            }
            else if(point[i][0] <=dest && point[i][1] >dest){
                dest = point[i][1];
            }
            else{
                length += dest -start;
                start = point[i][0];
                dest = point[i][1];
            }
        }
        length+= dest - start;
        System.out.println(length);
    }

    private static  void mergeSort(int start, int end){
        if(start<end){
            int middle = (start+end)/2;
            mergeSort(start, middle);
            mergeSort(middle+1, end);
            merge(start, middle, end);
        }
    }

    private static void merge( int start, int middle, int end){
        int i = start;
        int j = middle +1;
        int index = start;
        while(i<=middle && j<=end){
            if(point[i][0]< point[j][0]){
                sort[index][0] = point[i][0];
                sort[index][1] = point[i][1];
                i++;
                index++;
            }
            else{
                sort[index][0] = point[j][0];
                sort[index][1] = point[j][1];
                j++;
                index++;
            }
        }
        if(i>middle){
            while(j<=end){
                sort[index][0] = point[j][0];
                sort[index][1] = point[j][1];
                j++;
                index++;
            }
        }
        else{
            while(i<=middle){
                sort[index][0] = point[i][0];
                sort[index][1] = point[i][1];
                i++;
                index++;
            }
        }
        for(int t=start; t<=end;t++){
            point[t][0] = sort[t][0];
            point[t][1] = sort[t][1];
        }
    }
}
