package word;

import java.util.*;

public class Demo {
	public static void duplicateWord(String str) {
		String[] str1 = str.split(" ");
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			
			for (int j = 0; j < str1.length; j++) {
				if (str1[i].equals(str1[j])&&(i!=j)) {
					count++;

				}
			}

		}
		System.out.println(count/2);
				}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		Demo dt = new Demo();
		dt.duplicateWord(str);

	}
}
