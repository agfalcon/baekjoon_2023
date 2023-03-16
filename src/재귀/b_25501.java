package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_25501 {
    static int count =0;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            String input = br.readLine();
            sb.append(isPalindrome(input)).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static int isPalindrome(String word){
        count =0;
        return recursion(word, 0, word.length()-1);
    }

    private static int recursion(String word, int l, int r){
        count++;
        if(l>=r) return 1;
        else if(word.charAt(l) != word.charAt(r)) return 0;
        else return recursion(word, l+1, r-1);
    }
}
