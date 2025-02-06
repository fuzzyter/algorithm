import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 0;

        int[] student = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for(int i = 0; i < 28; i++) {
            num = Integer.parseInt(br.readLine());

            for(int j = 0; j < student.length; j++) {
                if(student[j] == num){
                    student[j] = 0;
                }
            }
        }

        for(int j = 0; j < student.length; j++) {
            if(student[j] !=0 ){
                bw.write(student[j] + "\n");
            }
        }

        br.close();
        bw.close();
    }
}