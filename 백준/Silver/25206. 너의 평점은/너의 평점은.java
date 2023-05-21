import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = 20;
        double sum = 0;
        double creditSum = 0;
        double total = 0;

        for(int i = 0; i < 20; i++){
            String str = br.readLine();
            StringTokenizer itr = new StringTokenizer(str);
            String name = itr.nextToken();
            double credit = Double.parseDouble(itr.nextToken());
            String grade = itr.nextToken();
            double gr = 0;

            switch (grade){
                case "A+":
                    gr = 4.5;
                    break;
                case "A0":
                    gr = 4.0;
                    break;
                case "B+":
                    gr = 3.5;
                    break;
                case "B0":
                    gr = 3.0;
                    break;
                case "C+":
                    gr = 2.5;
                    break;
                case "C0":
                    gr = 2.0;
                    break;
                case "D+":
                    gr = 1.5;
                    break;
                case "D0":
                    gr = 1.0;
                    break;
                case "F":
                    gr = 0.0;
                    break;
                case "P":
                    gr = 0.0;
                    credit = 0;
                    break;
            }
            sum += credit * gr;
            creditSum += credit;
        }
        total = (double) sum / creditSum;
        System.out.println(total);
    }
}