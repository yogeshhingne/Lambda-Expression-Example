package LambdaExpressionExample;
import java.util.*;
public class LambdaForComparator {
public static void main(String args[]) {
	ArrayList<Integer> l= new ArrayList();
	l.add(10);
	l.add(50);
	l.add(100);
	l.add(15);
	l.add(0);
	System.out.println("List in given order is"+l);
	Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
	Collections.sort(l,c);
	System.out.println("List in Sorted order is"+l);
}
}
