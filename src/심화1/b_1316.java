package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1316{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int check = N;
        for(int i=0;i<N;i++){
            String input = br.readLine();
            boolean alpha[] = new boolean[26];
            for(int j=0;j<input.length();j++){
                int index = input.charAt(j) - 'a';
                if(!alpha[index]){
                    alpha[index] = true;
                }
                else{
                    if(input.charAt(j)==input.charAt(j-1))
                        continue;
                    else{
                        check--;
                        break;
                    }

                }
            }
        }
        System.out.println(check);
    }
}
