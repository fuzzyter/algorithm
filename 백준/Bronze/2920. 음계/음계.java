import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());	
		
		int now = Integer.parseInt(st.nextToken());
		int ascending = 0;
		int descending= 0;
		
		for (int i = 2; i <= 8; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (num > now) {
				ascending = 1;
			} else {
				descending = 1;
			}
			now = num;
		}	
		
		if(ascending==1 && descending ==1) {
			bw.write("mixed");
		}else if(ascending==1) {
			bw.write("ascending");
		}else {
			bw.write("descending"); 
		}
		
		bw.close();
		br.close();
	}
}