package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_18258 {
    static int front,rear;
    static int queue[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        queue = new int[n+1];
        front = 0;
        rear = -1;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch(op){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    private static void push(int num){
        queue[++rear] = num;
    }

    private static int empty(){
        if(front>rear) return 1;
        else return 0;
    }

    private static int pop(){
        if(empty()==1) return -1;
        else return queue[front++];
    }

    private static int size(){
        return rear-front+1;
    }
    private static int front(){
        if(empty()==1) return -1;
        else return queue[front];
    }

    private static int back(){
        if(empty()==1) return -1;
        else return queue[rear];
    }
}
