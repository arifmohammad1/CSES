import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		int[] arr = new int[n-1];
		for(int i = 0; i < n-1; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		long k = (long)((long)n * (n+1))/2;
		System.out.println(k - sum);
}
}
		