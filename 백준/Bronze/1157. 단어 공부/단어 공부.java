import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        boolean flag = false;
        int maxValue = 0;
        int maxIndex = 0;
        
        int[] alphaArr = new int[26];
        for(int i=0; i<str.length(); i++){
            alphaArr[str.charAt(i)-'A']++;
        }
        
        for(int i=0; i<26; i++){
            int compare = alphaArr[i]- maxValue;
            if(compare > 0){
                 maxValue = alphaArr[i]; 
                 flag = false; 
                 maxIndex=i;
            } else if(compare == 0 ) {
                flag = true;
            }            
        }        
        if(flag) {
            System.out.println("?");
        }
        else {
            System.out.println((char)(maxIndex+'A'));
        }        
    }    
}