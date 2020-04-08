package exam.array;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
			
		int arr[] = new int[10];

		String[] str = new String[4]; 
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();	
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

