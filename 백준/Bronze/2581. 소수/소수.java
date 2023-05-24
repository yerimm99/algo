import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = n + 1;

        x : for(int i = m; i <= n; i++){
            if(i == 1){
                continue;
            }
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    continue x;
                }
            }
            sum += i;
            if (min > i) {
                min = i;
            }
        }
        if(sum > 0) {
            sb.append(sum + "\n" + min);
        }
        else{
            sb.append(-1);
        }
        System.out.println(sb);

    }
}