package 정렬;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class B2587 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arr = new int[5];
        for(int i =0 ;i<5;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        sum/=5;
        int[] temp = arr.clone();
        mergeSort(arr, temp, 0, 4);
        System.out.println(sum);
        System.out.println(arr[2]);
    }

    private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid+1, end);
            merge(arr, temp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
        int preIndex = start;
        int postIndex = mid+1;
        int index = start;
        while(preIndex<=mid && postIndex <= end){
            if(arr[postIndex] < arr[preIndex]) {
                temp[index] = arr[postIndex];
                postIndex++;
            }
            else {
                temp[index] = arr[preIndex];
                preIndex++;
            }
            index++;
        }
        for(int i = 0; i <= mid-preIndex;i++){
            temp[index+i] = arr[preIndex+i];
        }
        for(int i = start; i<=end;i++){
            arr[i] = temp[i];
        }
    }
}