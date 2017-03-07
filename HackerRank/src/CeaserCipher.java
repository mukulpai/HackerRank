import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		char[] c = in.next().toCharArray();
		int k = in.nextInt();
		char[] op = new char[num];
		for (int i = 0; i < num; i++) {
			int ascii = (int) c[i];
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				if ((ascii + k >= 91 && ascii + k < 97) || ascii + k >= 123)

					op[i] = (char) (ascii + k - 26);
					op[i] = (char) (ascii + k);

				System.out.print(op[i]);
			} else {

				System.out.print(c[i]);
			}
		}

		// for(int i =0; i < num; i++)
		// System.out.println(op);

	}
}
