import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while((input=br.readLine())!=null) {
			System.out.println(input);
		}
		br.close();
	}
}