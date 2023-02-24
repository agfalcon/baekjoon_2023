package sort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count[]  = new int[8001];
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        int num[] = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            num[i] = (Integer.parseInt(br.readLine()));
            sum += num[i];
            count[num[i]+4000]++;
        }
        //Quick(num, 0, N-1);
        Arrays.sort(num);
        sb.append((int)Math.round((double)sum/N)).append("\n");
        sb.append(num[N/2]).append("\n");
        int max = 0;
        int index = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                isFirst = true;
                index = i;
                max = count[i];
            }
            else if(count[i]==max && isFirst){
                isFirst = false;
                index = i;
            }
        }
        sb.append(index-4000).append("\n");
        sb.append(num[N-1]-num[0]).append("\n");
        System.out.println(sb);
    }

    private static  void Quick(int num[], int lo, int hi){
        if(lo>=hi)
            return;

        int pivot = partition(num, lo, hi);
        Quick(num, lo, pivot-1);
        Quick(num, pivot+1, hi);
    }

    private static int partition(int num[], int left, int right){
        int lo = left+1;
        int pivot = num[left];
        int hi = right;
        while(lo<=hi){

            while(hi>=lo && num[hi]>pivot){
                hi--;
            }

            while(lo<=hi && num[lo]<=pivot){
                lo++;
            }

            if(lo>=hi){
                swap(num, left, hi);
                break;
            }
            swap(num, lo, hi);
        }
        return hi;
    }

    private static void swap(int num[], int num1, int num2){
        int temp = num[num1];
        num[num1] = num[num2];
        num[num2] = temp;
    }
}
