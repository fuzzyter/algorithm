import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float result = 0;

        String input = br.readLine();
        if (!input.equals("F")){
            char grade = input.charAt(0);
            char num = input.charAt(1);

            switch (grade){
                case 'A':
                    result += 4;
                    break;
                case 'B':
                    result += 3;
                    break;
                case 'C':
                    result += 2;
                    break;
                case 'D':
                    result += 1;
                    break;
                default:
                    break;
            }
            switch (num){
                case '+':
                    result += 0.3;
                    break;
                case '-':
                    result -= 0.3;
                    break;
                default:
                    break;
            }

        }
        bw.write(result + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
