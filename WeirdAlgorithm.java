import java.util.*;
public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a = sc.nextLong();
        while(a != 1) {
            System.out.println(a);
            if(a%2 == 0) {
                a/=2;
            }
            else {
                a = (a*3)+1;
            }
        }
        System.out.println(1);
    }
}