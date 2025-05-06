import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int ww = N / H + 1;
            int hh = N % H;
            
            if (hh == 0) {
                hh = H;
                ww = N / H;
            }

            bw.write(hh * 100 + ww + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
