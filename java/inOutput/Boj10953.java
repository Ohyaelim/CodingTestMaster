import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a=0, b=0;

        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine(), ",");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }

        System.out.println(sb.toString());
    }
}
