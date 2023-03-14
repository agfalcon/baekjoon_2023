package 문자열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int time = 0;
        char selection;
        for(int i=0;i<input.length();i++){
            selection = input.charAt(i);
            if(selection>='W'){
                time +=10;
            }
            else if(selection>='T'){
                time +=9;
            }
            else if(selection>='P'){
                time +=8;
            }
            else if(selection>='M'){
                time +=7;
            }
            else if(selection>='J'){
                time +=6;
            }
            else if(selection>='G'){
                time +=5;
            }
            else if(selection>='D'){
                time +=4;
            }
            else{
                time +=3;
            }
        }
        System.out.println(time);
    }
}
