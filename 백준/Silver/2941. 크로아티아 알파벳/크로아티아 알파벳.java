import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        int i = 0;

        while(i < str.length()){
            if(str.charAt(i) == 'c' && i < str.length() - 1){
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if(str.charAt(i) == 'd' && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
                    if(str.charAt(i + 2) == '='){
                        i += 2;
                    }
                }
                else if (str.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            else if ((str.charAt(i) == 's' || str.charAt(i) == 'z') && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }
            cnt++;
            i++;
        }
        System.out.println(cnt);
    }
}