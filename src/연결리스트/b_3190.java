package 연결리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_3190 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int apple[][] = new int[K][2];
        StringTokenizer st;
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            apple[i][1] = Integer.parseInt(st.nextToken());
            apple[i][0] = Integer.parseInt(st.nextToken());
        }
        int L = Integer.parseInt(br.readLine());
        int direct[][] = new int[L][2];
        for(int i=0;i<L;i++){
            st = new StringTokenizer(br.readLine());
            direct[i][0] = Integer.parseInt(st.nextToken());
            direct[i][1] = (st.nextToken().equals("D")) ? -1 : 1;
        }

        int time = 0;
        int dir = 0;
        int index = 0;
        Snake snake = new Snake(null);
        Snake end = snake;

        while(true){
            time++;
            Snake temp = end;
            int x = end.x;
            int y = end.y;
            while(temp!=snake){
                temp.x = temp.prev.x;
                temp.y = temp.prev.y;
                temp = temp.prev;
            }
            switch(dir){
                case 0:
                    snake.x++;
                    break;
                case 1:
                    snake.y--;
                    break;
                case 2:
                    snake.x--;
                    break;
                case 3:
                    snake.y++;
                    break;
            }
            if(snake.x<=0 || snake.x>N || snake.y<=0 || snake.y>N){
                break;
            }
            temp = snake;
            boolean isCollapse = false;
            if(snake.x == x && snake.y == y){
                break;
            }
            while(temp!=end) {
                temp = temp.next;
                if (snake.x == temp.x && snake.y == temp.y) {
                    isCollapse = true;
                    break;
                }
            }
            if(index < direct.length && time == direct[index][0]){
                dir = dir+direct[index][1];
                if(dir<0) dir+=4;
                if(dir>3) dir-=4;
                index++;
            }
            for(int i=0;i< apple.length;i++){
                if(snake.x == apple[i][0] && snake.y == apple[i][1]){
                    end.next = new Snake(end);
                    end= end.next;
                    end.x = x;
                    end.y = y;
                    apple[i][0] = -1;
                    apple[i][1] = -1;
                    break;
                }
            }
            if(isCollapse) break;
        }
        System.out.println(time);
    }
}

class Snake{
    int x;
    int y;
    Snake next;
    Snake prev;

    public Snake(Snake prev){
        x = 1;
        y = 1;
        next = null;
        this.prev = prev;
    }
}
