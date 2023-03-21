package 연결리스트;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class b_1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0;i<input.length();i++){
            list.add(input.charAt(i));
        }
        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext()) iter.next();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op){
                case "L":
                    if(iter.hasPrevious()) iter.previous();
                    break;
                case "D":
                    if(iter.hasNext()) iter.next();
                    break;
                case "B":
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case "P":
                    iter.add(st.nextToken().charAt(0));
                    break;
            }
        }
        for(Character c: list){
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
