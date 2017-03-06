import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int[] arr = new int[num+1];

		for (int i = 1; i <= num; i++) {
			arr[i] = in.nextInt();
		}

		for (int j = 1; j <= num; j++) {

			loop: for (int i = 1; i <= num; i++) {
				if (arr[i] == j) {
					for (int m = 1; m <= num; m++) {
						if (arr[m] == i) {
							System.out.println(m);
							break loop;
						}
					}
				}
			}
		}
	
    }}
