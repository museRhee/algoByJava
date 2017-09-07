package algo_pjt;

import java.io.*;
import java.util.*;

public class putNaturalNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		long answer = Long.valueOf(a) + Long.valueOf(b);
		
		System.out.println(answer);
		}
}
