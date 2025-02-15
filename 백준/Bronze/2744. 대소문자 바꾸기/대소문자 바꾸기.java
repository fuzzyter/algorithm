import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        bw.write(result.toString() + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
