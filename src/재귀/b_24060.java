package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_24060 {
    static int[] temp;
    static int count = 0;
    static int result = -1;
    static int K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        temp = new int[N];
        int list[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(list, 0, N-1);
        System.out.println(result);
    }
    private static void merge_sort(int list[], int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            merge_sort(list,start, mid);
            merge_sort(list,mid+1, end);
            merge(list, start, mid, end);
        }
    }
    private static void merge(int list[], int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int index = start;
        while(i<=mid && j<=end){
            if(list[i]<=list[j])
                temp[index++] = list[i++];
            else
                temp[index++] = list[j++];
        }
        while(i<=mid){
            temp[index++] = list[i++];
        }
        while(j<=end){
            temp[index++] = list[j++];
        }
        for(i=start;i<=end;i++){
            list[i] = temp[i];
            count++;
            if(count==K){
                result=list[i];
            }
        }
    }
}
