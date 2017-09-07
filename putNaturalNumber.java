package algo_pjt;

import java.io.*;
import java.util.*;

public class putNaturalNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader inputLine = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNumber = inputLine.readLine().split(" ");
		String a = inputNumber[0] + inputNumber[1];
		String b = inputNumber[2] + inputNumber[3];
		long answer = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(answer);	
	}
}
