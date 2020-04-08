package exam.array;

import java.io.*;
import java.util.StringTokenizer;

public class Array10818 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
			
		int arr[] = new int[Integer.parseInt(br.readLine())];
				
		
		int maxNum = -100000, minNum = 1000000;
			
		StringTokenizer sT = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(sT.nextToken());
			
			if(arr[i] < minNum) {
				minNum = arr[i];
			} 
			
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		
		sb.append(minNum+" "+maxNum);
		
			
		
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

