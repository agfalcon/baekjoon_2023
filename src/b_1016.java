import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class b_1016 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean nn[] = new boolean[(int)(max-min+1)];
        boolean sosu[] = new boolean[(int)Math.sqrt(max)+1];
        for(int i=2;i<sosu.length;i++){
            if(sosu[i])
                continue;
            for(int j=i*2;j< sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<sosu.length;i++){
            if(!sosu[i])
                list.add(i);
        }
        int count = (int) (max-min+1);
        for(int i=0;i<list.size();i++){
            long num = (long) Math.pow(list.get(i),2);
            for(int j=0;j<nn.length;j++){
                if(nn[j])
                    continue;
                if(num>j+min)
                    continue;
                if((j+min)%num==0){
                    nn[j] = true;
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
