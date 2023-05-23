import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 1;
        int n = num - 1;

        while(n > 0) {
            b++;
            n--;
            while (b > 1 && n > 0) {
                a++;
                b--;
                n--;
            }
            if(n > 0) {
                a++;
                n--;
            }
            while (a > 1 && n > 0) {
                a--;
                b++;
                n--;
            }
        }
            sb.append(a + "/" + b);
            System.out.println(sb);

    }
}