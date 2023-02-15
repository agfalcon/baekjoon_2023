package 재귀;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_1759 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        ArrayList<Character> child = new ArrayList<>();
        ArrayList<Character> parent = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<C;i++){
            char input = st.nextToken().charAt(0);
            if(isChild(input)){
                child.add(input);
            }
            else{
                parent.add(input);
            }
        }
        StringBuilder sb = new StringBuilder();

        ArrayList<char[]> result_child = new ArrayList<>();
        Collections.sort(child);
        Collections.sort(parent);
        boolean visited_c[] = new boolean[child.size()];
        boolean visited_b[] = new boolean[parent.size()];
        ArrayList<char[]> result_parent = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(int i=2;L-i>=1 && i<=child.size();i++){
            result_parent.clear();
            result_child.clear();
            getAlpha(result_parent, L-i, L-i, 0, parent, visited_b);
            getAlpha(result_child, i, i, 0,child, visited_c);
            for(int c=0;c<result_child.size();c++){
                for(int p=0;p<result_parent.size();p++){
                    char[] temp = new char[result_child.get(c).length + result_parent.get(p).length];
                    System.arraycopy(result_child.get(c), 0, temp, 0, result_child.get(c).length);
                    System.arraycopy(result_parent.get(p), 0, temp, result_child.get(c).length, result_parent.get(p).length);
                    Arrays.sort(temp);
                    String s = "";
                    for(int t=0;t<temp.length;t++){
                        s = s + temp[t];
                    }
                    if(!result.contains(s)){
                        result.add(s);
                    }
                }
            }
        }
        Collections.sort(result);
        for(int i=0;i<result.size();i++){
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);
    }

    private static void getAlpha(ArrayList result, int t, int r, int depth, ArrayList list, boolean visited[]){
        if(r==0){
            save(list, t, visited, result);
            return;
        }
        if(depth==list.size()){
            return;
        }
        else{
            visited[depth] = true;
            getAlpha(result, t, r-1, depth +1,  list, visited);

            visited[depth] = false;
            getAlpha(result,t, r, depth +1, list, visited);
        }
    }

    private static void save(ArrayList<Character> list, int r, boolean[] visited, ArrayList<char[]> result){
        char[] temp = new char[r];
        int t = 0;
        for(int i=0;i<list.size();i++){
            if(visited[i]){
                temp[t] = list.get(i);
                t++;
            }
        }
        result.add(temp);
    }

    private static boolean isChild(char input){
        if(input == 'a' || input == 'e' || input=='i' || input =='o' || input=='u')
            return false;
        else return true;
    }
}
