package LambdaExpressionExample;
@FunctionalInterface
public interface A {
public int sum(int a,int b);
}
class Test {
	public static void main(String x[]) {
A ref=(a,b)->a+b;
System.out.println(ref.sum(18,20));
}
}