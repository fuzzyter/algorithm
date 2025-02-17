import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());

        char result = word.charAt(num-1);

        bw.write(result + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
