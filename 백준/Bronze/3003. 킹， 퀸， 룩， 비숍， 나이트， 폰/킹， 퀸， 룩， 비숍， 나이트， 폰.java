import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer itr = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < 2){
            int n = Integer.parseInt(itr.nextToken());
            int cnt = 0;
            if (n != 1) {
                if (n > 1) {
                    cnt = 1 - n;
                } else if (n == 0) {
                    cnt = n + 1;
                }
            }
            sb.append(cnt + " ");
            i++;
        }

        i = 0;
        while(i < 3){
            int n = Integer.parseInt(itr.nextToken());
            int cnt = 0;
            if (n != 2) {
                cnt = 2 - n;
            }
            sb.append(cnt + " ");
            i++;
        }

        int n = Integer.parseInt(itr.nextToken());
        int cnt = 0;
        if (n != 8){
            cnt = 8 - n;
        }
        sb.append(cnt);

        System.out.println(sb);
    }
}