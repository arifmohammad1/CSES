import java.util.*;
public class IncreasingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		long sum = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    if(i > 0) {
		        int y = Math.max(0,arr[i-1] - arr[i]);
		        arr[i] += y;
		        sum += y;
		    }
		}
		
		System.out.println(sum);
}
}
		