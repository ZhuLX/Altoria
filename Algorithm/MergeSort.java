
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int m = 0; m < n; m++) {
			a[m] = sc.nextInt();
		}
		eforder(a, 0, n-1);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void eforder(int a[], int left, int right) {
		int mid;
		if (left >= right) {
			return;
		}
		mid = (left + right) / 2;
		eforder(a, left, mid);
		eforder(a, mid + 1, right);
		int i = left;
		int j = mid + 1;
		int k = left;
		while (i <= mid && j<=  right) {
			if (a[i] < a[j])
				save.b[k++] = a[i++];
			else {
				save.b[k++] = a[j++];
			}
		}
		while (i <= mid) {
			save.b[k++] = a[i++];
		}
		while (j <= right) {
			save.b[k++] = a[j++];
		}
		for (i = left; i <= right; i++) {
			a[i] = save.b[i];
		}

	}

	public static class save {
		public static int b[] = new int[100];
	}
}
