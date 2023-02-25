package sort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class b_11000 {

    static int[][] sort;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int room = 0;
        int[][] lecture = new int[N*2][2];
        sort = new int[N*2][2];
        StringTokenizer st;
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            lecture[i*2][0] = Integer.parseInt(st.nextToken());
            lecture[i*2+1][0] = Integer.parseInt(st.nextToken());
            lecture[i*2][1] = 0;
            lecture[i*2+1][1] = 1;
        }
        mergeSort(lecture, 0, N*2-1);
        for(int i=0;i<N*2;i++){
            if(lecture[i][1]==0){
                room++;
                if(max<room){
                    max = room;
                }
            }
            else{
                room--;
            }
        }
        System.out.println(max);
    }
    private static void mergeSort(int[][] lecture, int start, int end){
        if(start<end){
            int middle = (start+end)/2;
            mergeSort(lecture, start, middle);
            mergeSort(lecture, middle+1, end);
            merge(lecture, start, middle, end);
        }
    }

    private static void merge(int[][]lecture, int start, int middle, int end){
        int i = start;
        int j = middle +1;
        int index = start;
        while(i<=middle && j<=end){
            if(lecture[i][0] < lecture[j][0]){
                sort[index][0] = lecture[i][0];
                sort[index][1] = lecture[i][1];
                i++;
                index++;
            }
            else if(lecture[i][0] == lecture[j][0]){
                if(lecture[i][1]==1){
                    sort[index][0] = lecture[i][0];
                    sort[index][1] = lecture[i][1];
                    i++;
                    index++;
                }
                else{
                    sort[index][0] = lecture[j][0];
                    sort[index][1] = lecture[j][1];
                    j++;
                    index++;
                }
            }
            else{
                sort[index][0] = lecture[j][0];
                sort[index][1] = lecture[j][1];
                j++;
                index++;
            }
        }
        if(i>middle){
            while(j<=end){
                sort[index][0] = lecture[j][0];
                sort[index][1] = lecture[j][1];
                j++;
                index++;
            }
        }
        else{
            while(i<=middle){
                sort[index][0] = lecture[i][0];
                sort[index][1] = lecture[i][1];
                i++;
                index++;
            }
        }
        for(int t=start;t<=end;t++){
            lecture[t][0] = sort[t][0];
            lecture[t][1] = sort[t][1];
        }
    }
}
