package 정렬;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class B11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int[][] temp = new int[N][2];
        for(int i=0 ;i<N;i++){
            temp[i][0] = arr[i][0];
            temp[i][1] = arr[i][1];
        }
        mergeSort(arr, temp, 0, N-1);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.print(sb);
    }

    private static void mergeSort(int[][]arr, int[][] temp, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid+1, end);
            merge(arr, temp, start, mid, end);
        }
    }

    private static void merge(int[][] arr, int[][] temp, int start, int mid, int end) {
        int preIndex = start;
        int postIndex = mid+1;
        int index = start;
        while(preIndex <= mid && postIndex <= end) {
            if(arr[preIndex][0] < arr[postIndex][0]) {
                temp[index][0] = arr[preIndex][0];
                temp[index][1] = arr[preIndex][1];
                preIndex++;
            }
            else if(arr[postIndex][0] < arr[preIndex][0]){
                temp[index][0] = arr[postIndex][0];
                temp[index][1] = arr[postIndex][1];
                postIndex++;
            }
            else if(arr[postIndex][1] < arr[preIndex][1]){
                temp[index][0] = arr[postIndex][0];
                temp[index][1] = arr[postIndex][1];
                postIndex++;
            }
            else {
                temp[index][0] = arr[preIndex][0];
                temp[index][1] = arr[preIndex][1];
                preIndex++;
            }
            index++;
        }
        for(int i = 0; i<=mid-preIndex;i++){
            temp[index+i][0] = arr[preIndex+i][0];
            temp[index+i][1] = arr[preIndex+i][1];
        }
        for(int i=start;i<=end;i++){
            arr[i][0] = temp[i][0];
            arr[i][1] = temp[i][1];
        }
    }
}
