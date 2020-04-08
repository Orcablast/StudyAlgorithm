package exam.array;

import java.io.*;
import java.util.StringTokenizer;

public class Array2562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
			
		int arr[] = new int[9];
				
		
		int maxNum = 0, index = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > maxNum) {
				maxNum = arr[i];
				index = i+1;
			}
		}
		
		sb.append(maxNum+"\n"+index);
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

