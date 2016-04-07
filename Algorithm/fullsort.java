import java.util.Scanner;

public class fullsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			String str = sc.next();
			if(str.length()>n)
			break;
			char ch[] = str.toCharArray();
			sort(ch, 0, n - 1);
			break;
		}
	}

	public static void sort(char[] ch, int a, int b) {
		if (a == b) {
			for (int i = 0; i <= b; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = a; i <= b; i++) {
				char t = ch[a];
				ch[a] = ch[i];
				ch[i] = t;
				sort(ch, a + 1, b);
				t = ch[a];
				ch[a] = ch[i];
				ch[i] = t;
			}
		}
	}
}
