package 문자열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class b_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int alpha[] = new int[(int)'z' - 'a' +1];
        for(int i=0;i<alpha.length;i++){
            alpha[i] = -1;
        }
        int index;
        for(int i=0;i<input.length();i++){
            index = input.charAt(i)-'a';
            if(alpha[index]==-1)
                alpha[index] = i;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<alpha.length;i++){
            sb.append(alpha[i] + " ");
        }
        System.out.println(sb);
    }
}
