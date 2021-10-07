package LambdaExpressionExample;
import java.util.function.Consumer;
public class LambdaForConsumer {
public static void main(String args[]) {
	Consumer<String> c= x -> System.out.println(x);
	c.accept("Hallo Indrajeet and Pranav");	
}
}
