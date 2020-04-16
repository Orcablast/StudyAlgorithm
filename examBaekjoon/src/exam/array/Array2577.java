package exam.array;

import java.io.*;

public class Array2577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
		
		int arr[] = new int[10];
		
		String result = String.valueOf(Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));
		
		
		
		for(int i = 0; i<result.length(); i++) {
			int j =(result.charAt(i)-'0'); 
			arr[j]++; 
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

