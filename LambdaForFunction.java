package LambdaExpressionExample;
import java.util.Scanner;
import java.util.function.Function;
public class LambdaForFunction {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius for the circle");
	float r=sc.nextFloat();
	Function<Float, Double> ref=x->3.14*r*r;
	System.out.println("Area of circle is "+ref.apply(r));	
}
}
