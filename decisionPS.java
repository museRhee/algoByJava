package algo_pjt;

import java.util.*;

/**
 * 
 * @author muse
 * 설명 추가, 한번에 n개의 입력받아서 한번에 출력하도록 수정?
 * 
 *
 */

public class decisionPS {
	public static String isValid(String s) {
		//s = s.trim();
		int n = s.length();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				cnt += 1;
			} else {
				cnt -= 1;
			}
			if (cnt < 0) {
				return "NO";
			}
		}
		if (cnt == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			System.out.println(isValid(sc.nextLine()));
		}
	}
}
