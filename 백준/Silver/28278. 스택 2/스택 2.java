
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String S = br.readLine();
            if(S.contains(" ")) {
                String[] arr = S.split(" ");
                if(arr[0].equals("1")) {
                    stack.push(Integer.parseInt(arr[1]));
                }
            } else {
                int num = Integer.parseInt(S);
                if(stack.isEmpty() && num == 4) {
                    sb.append("1\n");
//                    System.out.println(1);
                    continue;
                } else if(stack.isEmpty() && (num == 5 || num == 2)) {
//                    System.out.println(-1);
                    sb.append("-1\n");
                    continue;
                }
                switch (num) {
                    case 2:
                        sb.append(stack.pop()).append("\n");
//                        System.out.println(stack.pop());
                        break;
                    case 3:
                        sb.append(stack.size()).append("\n");
//                        System.out.println(stack.size());
                        break;
                    case 4:
                        sb.append("0\n");
//                        System.out.println(0);
                        break;
                    case 5:
                        sb.append(stack.peek()).append("\n");
//                        System.out.println(stack.peek());
                        break;
                    default:
                        break;
                }
            }

        }

        System.out.println(sb);


    }
}
