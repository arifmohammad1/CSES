import java.util.*;
public class Repititions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 1;
		char d = s.charAt(0);
		int maxi = 0;
		for(int i = 1; i < s.length(); i++) {
		    if(s.charAt(i) == d) count++;
		    else {
		        maxi = Math.max(maxi,count);
		        count = 1;
		        d = s.charAt(i);
		    }
		}
		maxi = Math.max(maxi,count);
		System.out.println(maxi);
}
}
		