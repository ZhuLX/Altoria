import java.util.Scanner;
import java.util.Arrays;;

public class Close {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		int n = ex.nextInt();
		int min;
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = ex.nextInt();
		}
		min = compare(data, n);
		System.out.println(min);
	}

	public static int compare(int data[], int n) {
		int instance[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == n - 1 && n - 2 >= 0)
				instance[i] = data[n - 1] - data[n - 2];
			else
				instance[i] = data[i + 1] - data[i];
		}
		Arrays.sort(instance);
		int close = instance[0];
		return close;
	}
}
