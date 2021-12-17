package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Integer[] ar= {2,5,7,6,9,3,2,4};
		List<Integer> numbers=Arrays.asList(ar);
		 
		numbers.forEach(System.out::println);
		numbers.forEach(FirstStreamDemo::print);
		
		Stream<Integer> str1=numbers.stream();
		str1.forEach(System.out::println);
		
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println(numbers.stream().distinct().count());
		
		numbers.stream().filter(n->n>=5).forEach(System.out::println);
		
		//str1.limit(5).forEach(System.out::println);
		
		//str1.distinct().sorted().forEach(System.out::println);
		
		//System.out.println(str1.reduce(0,(n,m)->n+m));
		
		//System.out.println(str1.reduce(0,FirstStreamDemo::add));
		
		//System.out.println(str1.reduce(0,Integer::sum));
		
		IntStream istr=IntStream.range(1, 99);
		System.out.println(istr.count());
		//System.out.println(istr.sum());
		//System.out.println(istr.skip(5).count());
		
		//IntStream istr= IntStream.of(2,5,4,6,8,3);
		//System.out.println(istr.count());
		//System.out.println(istr.sum());
		
		//IntSummaryStatistics statics=istr.summaryStatistics();
		//System.out.println(statics);
		
	}

}
