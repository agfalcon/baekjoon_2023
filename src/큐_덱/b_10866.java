package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10866 {
    static int front, rear;
    static int deque[];
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        deque = new int [2*N];
        front = N;
        rear = N-1;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op){
                case "push_front":
                    int num = Integer.parseInt(st.nextToken());
                    pushFront(num);
                    break;
                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    pushBack(num);
                    break;
                case "pop_front":
                    sb.append(popFront()).append("\n");
                    break;
                case "pop_back":
                    sb.append(popBack()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(frontPeek()).append("\n");
                    break;
                case "back":
                    sb.append(backPeek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    private static int empty(){
        if(front>rear) return 1;
        else return 0;
    }

    private static int size(){
        return rear-front+1;
    }

    private static int frontPeek(){
        if(empty()==1) return -1;
        else return deque[front];
    }

    private static int backPeek(){
        if(empty()==1) return -1;
        else return deque[rear];
    }

    private static int popFront(){
        if(empty()==1) return -1;
        else return deque[front++];
    }

    private static int popBack(){
        if(empty() ==1) return -1;
        else return deque[rear--];
    }

    private static void pushFront(int num){
        deque[--front] = num;
    }

    private static void pushBack(int num){
        deque[++rear] = num;
    }
}
