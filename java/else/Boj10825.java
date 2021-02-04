import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static  void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String [][] arr = new String[n][4];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            String kor = st.nextToken();
            String eng = st.nextToken();
            String mat = st.nextToken();
            arr[i][0] = name;
            arr[i][1] = kor;
            arr[i][2] = eng;
            arr[i][3] = mat;

        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])){
                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])){
                        if(Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])){
                            return s1[0].compareTo(s2[0]); //오름차순
                        }
                        return Integer.compare(Integer.parseInt(s2[3]),Integer.parseInt(s1[3]));

                    }
                    return Integer.compare(Integer.parseInt(s1[2]),Integer.parseInt(s2[2]));
                }
                return Integer.compare(Integer.parseInt(s2[1]),Integer.parseInt(s1[1]));
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
        }

    }
}
