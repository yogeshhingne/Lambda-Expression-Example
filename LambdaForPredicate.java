package LambdaExpressionExample;
import java.util.Scanner;
import java.util.function.Predicate;
public class LambdaForPredicate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for even number");
		int n=sc.nextInt();
Predicate<Integer> p=x->x%2==0;
System.out.println(p.test(n));
}
}