import java.util.Scanner;



public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int loc ;
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			int x = sc.nextInt();
			int data[] = new int[k];
			for(int j=0;j<k;j++){
				data[j]=sc.nextInt();
			}
			loc = find(data, x, 0, k - 1);
			System.out.println(loc+" "+times.cc);

		}
	}
	public static int find(int data[], int x, int left, int right) {
		int mid;
		times.cc=0;
		while (left <= right) {
			mid = (left + right) / 2;
			times.cc++;
			if (data[mid] == x)
				return mid + 1;		
			if (x < data[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return 0;
	}
	public static  class times{
		public static int cc = 0;
	}
	
}

