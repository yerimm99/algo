import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer itr = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(itr.nextToken());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            itr = new StringTokenizer(br.readLine());
            String str = itr.nextToken();
            switch (str){
                case "push":
                    stack.push(Integer.parseInt(itr.nextToken()));
                    break;
                case "top":
                    if(stack.size() != 0) {
                        System.out.println(stack.peek());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "pop":
                    if(stack.size() != 0) {
                        System.out.println(stack.peek());
                        stack.pop();
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.size() != 0) {
                        System.out.println(0);
                    }else{
                        System.out.println(1);
                    }
                    break;
            }
        }

        System.out.println();
    }
}