import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().trim();

        if (line.isEmpty()) {
            bw.write("0");
        } else {
            String[] words = line.split(" ");
            bw.write(String.valueOf(words.length));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
