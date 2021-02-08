import java.io.*;
import java.util.*;

public class Main{
    static int node [][];
    static int check [];
    static Queue<Integer> queue = new LinkedList<Integer>();

    static void dfs(int x){
        if (check[x]==1)
            return ;
        
        check[x] = 1;
        System.out.print(x + " ");

        for (int i = 1; i < node.length; i++) {
            if (node[x][i]==1)
                dfs(i);
        }
    }

    static void bfs(int x){
        queue.offer(x);
        check[x]=1;

        while (!queue.isEmpty()){
            x = queue.poll();
            System.out.print(x + " ");

            for (int i = 1; i < node.length; i++) {
                if(node[x][i]==1 && check[i]!=1){
                    queue.offer(i);
                    check[i]=1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=0, m=0, v=0;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        node = new int[n+1][n+1];
        check = new int[n+1];

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = 1;
            node[b][a] = 1;
        }

        dfs(v);
        Arrays.fill(check, 0);
        System.out.println();
        bfs(v);
    }
}

