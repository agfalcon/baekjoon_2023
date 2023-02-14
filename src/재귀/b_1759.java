package 재귀;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        ArrayList<Character> result = new ArrayList<>();
        for(int i=2;L-i>=1;i++){
            result.clear();
            getAlpha(result, i, parent);
            getAlpha(result, L-i, child);
            Collections.sort(result);
            for(int j=0;j<result.size();j++){
                sb.append(result.get(j));
            }
            sb.append("\n");
        }
    }

    private static void getAlpha(ArrayList result, int num, ArrayList list){

    }

    private static boolean isChild(char input){
        if(input == 'a' || input == 'e' || input=='i' || input =='o' || input=='u')
            return false;
        else return true;
    }
}
