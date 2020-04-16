package exam.array;

import java.io.*;
import java.util.HashSet;

public class Array3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();
		
		int arr[] = new int[10];
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		
		for(int i=0; i<arr.length; i++) {
			
			set.add((Integer.parseInt(br.readLine()))%42);
		}
		
		sb.append(set.size());
		
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

