import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result=solution(n);
        System.out.println(result);
    }

    public static int solution(int n){
        int t []= new int[n+2];
        t[1]=1;
        t[2]=3;

        for (int i = 3; i <n+1; i++) {
            t[i]=(t[i-2]*2 + t[i-1]) % 10007;
        }
        return t[n];
    }

}
