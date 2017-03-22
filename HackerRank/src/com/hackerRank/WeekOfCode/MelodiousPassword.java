package com.hackerRank.WeekOfCode;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MelodiousPassword {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		char vowel[] = "aeiou".toCharArray();
		char consonants[] = "bcdfghjklmnpqrstvwxz".toCharArray();
		if (n == 1) {
			for (int l = 0; l < consonants.length; l++) {

				System.out.println(consonants[l]);
			}
			for (int k = 0; k < vowel.length; k++) {
				System.out.println(vowel[k]);
			}

		} else if (n == 2) {

			for (int k = 0; k < vowel.length; k++) {
				for (int l = 0; l < consonants.length; l++) {
					System.out.println(vowel[k] + "" + consonants[l]);

				}
			}

			for (int k = 0; k < vowel.length; k++) {
				for (int l = 0; l < consonants.length; l++) {
					System.out.println(consonants[l] + "" + vowel[k]);
				}
			}

		} else if (n == 3) {

			for (int m = 0; m < vowel.length; m++) {
				for (int k = 0; k < vowel.length; k++) {
					for (int l = 0; l < consonants.length; l++) {
						System.out.println(vowel[m] + "" + consonants[l] + "" + vowel[k]);

					}
				}
			}
			for (int q = 0; q < consonants.length; q++) {
				for (int l = 0; l < consonants.length; l++) {
					for (int k = 0; k < vowel.length; k++) {
						System.out.println(consonants[l] + "" + vowel[k] + "" + consonants[q]);
					}
				}
			}

		} else if (n == 4) {
			for (int m = 0; m < vowel.length; m++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int o = 0; o < vowel.length; o++) {
						for (int p = 0; p < consonants.length; p++) {
							System.out.println(vowel[m] + "" + consonants[k] + "" + vowel[o] + "" + consonants[p]);
						}
					}
				}
			}

			for (int m = 0; m < consonants.length; m++) {
				for (int k = 0; k < vowel.length; k++) {
					for (int o = 0; o < consonants.length; o++) {
						for (int p = 0; p < vowel.length; p++) {
							System.out.println(consonants[m] + "" + vowel[k] + "" + consonants[o] + "" + vowel[p]);
						}
					}
				}
			}
		} else if (n == 5) {
			for (int m = 0; m < vowel.length; m++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int o = 0; o < vowel.length; o++) {
						for (int p = 0; p < consonants.length; p++) {
							for (int t = 0; t < vowel.length; t++) {
								System.out.println(vowel[m] + "" + consonants[k] + "" + vowel[o] + "" + consonants[p]
										+ "" + vowel[t]);
							}
						}
					}
				}
			}

			for (int m = 0; m < consonants.length; m++) {
				for (int k = 0; k < vowel.length; k++) {
					for (int o = 0; o < consonants.length; o++) {
						for (int p = 0; p < vowel.length; p++) {
							for (int t = 0; t < consonants.length; t++) {
								System.out.println(consonants[m] + "" + vowel[k] + "" + consonants[o] + "" + vowel[p]
										+ "" + consonants[t]);
							}
						}
					}
				}
			}

		} else if (n == 6) {

			OutputStream out = new BufferedOutputStream(System.out);

			for (int m = 0; m < vowel.length; m++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int o = 0; o < vowel.length; o++) {
						for (int p = 0; p < consonants.length; p++) {
							for (int t = 0; t < vowel.length; t++) {
								for (int b = 0; b < consonants.length; b++) {

									out.write((vowel[m] + "" + consonants[k] + "" + vowel[o] + "" + consonants[p] + ""
											+ vowel[t] + "" + consonants[b] + "\n").getBytes());
									// System.out.println(vowel[m] + "" +
									// consonants[k] + "" + vowel[o] + ""
									// + consonants[p] + "" + vowel[t] + "" +
									// consonants[b]);
								}
							}
						}
					}
				}
			}

			for (int m = 0; m < consonants.length; m++) {
				for (int k = 0; k < vowel.length; k++) {
					for (int o = 0; o < consonants.length; o++) {
						for (int p = 0; p < vowel.length; p++) {
							for (int t = 0; t < consonants.length; t++) {
								for (int b = 0; b < vowel.length; b++) {
									out.write((consonants[m] + "" + vowel[k] + "" + consonants[o] + "" + vowel[p] + ""
											+ consonants[t] + "" + vowel[b] + "\n").getBytes());
									// System.out.println(consonants[m] + "" +
									// vowel[k] + "" + consonants[o] + ""
									// + vowel[p] + "" + consonants[t] + "" +
									// vowel[b]);
								}
							}
						}
					}
				}
			}

		}

	}
}
