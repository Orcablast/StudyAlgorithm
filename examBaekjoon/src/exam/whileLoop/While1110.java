package exam.whileLoop;

import java.io.*;

public class While1110 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
		
		int origin = Integer.parseInt(br.readLine());
		
		int count = 0;
		int result = origin;		
		
		do {
			count++;
			
			result = ((result%10)*10)+(((result/10)%10)+(result%10))%10;
			
		} while(origin != result);
		
		sb.append(count);
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}
