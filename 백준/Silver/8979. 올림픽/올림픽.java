import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer itr = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(itr.nextToken());
        int k = Integer.parseInt(itr.nextToken());
        int arr [][] = new int[n + 1][4];
        int rank = 1;

        for(int i = 1; i <= n; i++){
            StringTokenizer itr2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(itr2.nextToken());
            }
        }
        for(int i = 1; i <= n; i++) {
            if(arr[i][0] > arr[k][0]) {
                rank++;
            }
            else if(arr[i][0] == arr[k][0] && arr[i][1] > arr[k][1]) {
                rank++;
            }
            else if(arr[i][0] == arr[k][0] && arr[i][1] == arr[k][1] && arr[i][2] > arr[k][2]) {
                rank++;
            }
        }
        System.out.println(rank);
    }
}