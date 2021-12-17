import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Consumer<String> c1=System.out::println;
		c1.accept("Hello");
		c1.accept("hola");
		c1.accept("Bonjour");
		
		Consumer<String> c2= LamdaDemo::print;
		c2.accept("Aloha");
		
		Supplier<String> s1=()->"Adios";
		System.out.println(s1.get());
		print(s1.get());
		
		Predicate<Integer> p1=(x)->x>=0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(-5));
		
		Predicate<Integer> p2=(x) ->x%2==0;
		System.out.println(p2.test(3));
		System.out.println(p2.test(4));
		
		BiPredicate<String, String> p3=(s,c)-> s.contains(c);
		Function<Integer, Integer> f1=(x)->x*x;
		System.out.println(f1.apply(5));
		
	}

}
