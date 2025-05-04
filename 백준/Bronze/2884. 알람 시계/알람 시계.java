import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] time = br.readLine().split(" ");
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);

        if (M < 45) {
            M += 15;
            H--;
            if (H < 0) H = 23;
        } else {
            M -= 45;
        }

        bw.write(H + " " + M + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
