import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer itr = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(itr.nextToken());
        int b = Integer.parseInt(itr.nextToken());
        int v = Integer.parseInt(itr.nextToken());

        int day = (v - b) / (a - b);

        if((v - b) % (a - b) != 0){
            day++;
        }

        System.out.println(day);

    }
}