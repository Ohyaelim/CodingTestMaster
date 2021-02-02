import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int [] b = new int [1002];
        b[1]=1;
        b[2]=2;
        for(int i=3;i<=n;i++){
            b[i]=(b[i-1]+b[i-2])%10007;
        }
        out.println(b[n]);
    }
}
