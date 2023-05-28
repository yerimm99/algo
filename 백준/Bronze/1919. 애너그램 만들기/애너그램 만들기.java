import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int len1 = str1.length();
        int len2 = str2.length();

        int cnt1[] = new int[30];
        int cnt2[] = new int[30];

        for(int i = 0; i < 30; i++){
            cnt1[i] = 0;
            cnt2[i] = 0;
        }
        for(int i = 0; i < len1; i++){
            cnt1[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < len2; i++){
            cnt2[str2.charAt(i) - 'a']++;
        }
        int total = 0;
        for(int i = 0; i < 30; i++){
            if(cnt1[i] - cnt2[i] < 0) {
                total += (-1 * (cnt1[i] - cnt2[i]));
            }else {
                total += (cnt1[i] - cnt2[i]);
            }
        }
        System.out.println(total);
    }
}