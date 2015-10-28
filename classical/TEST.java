/* Your program is to use the brute-force approach in order to find 
the Answer to Life, the Universe, and Everything. More precisely... 
rewrite small numbers from input to output. Stop processing input 
after reading in the number 42. All numbers at input are integers 
of one or two digits. */

import java.io.*;
import java.util.*;


class TEST {
	
	private static final Scanner in = new Scanner(System.in);
	
	public static void run() {
		while (in.hasNext()) {
			int num = in.nextInt();
			if (num == 42) {
				return;
			}
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new TEST().run();
	}
	
}