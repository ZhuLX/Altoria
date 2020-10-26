import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int m = 0; m < n; m++) {
			a[m] = sc.nextInt();
		}
		quick(a, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void quick(int a[], int left, int right) {
		int i, j, t;
		if (left >= right)
			return;
		i = left;
		j = right;
		int key = a[left];
		while (i < j) {
			while (i < j && key <= a[j]) {
				j--;
			}
			a[i] = a[j];
			while (i < j && key >= a[i]) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = key;
		quick(a, left, i - 1);
		quick(a, i + 1, right);

	}
}

