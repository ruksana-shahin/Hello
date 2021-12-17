package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdStream {
	public static void main(String[] args) {
		Map<String, String> people=new HashMap<>();
		people.put("polo", "pune");
		people.put("Milli", "Mumbai");
		people.put("Nick", "Nashik");
		
		people.values().forEach(System.out::println);
		
		List<String> cities=people.values().stream().sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts=new HashMap<String, List<String>>();
		contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Jack", Arrays.asList("2323-4545","6565-9898"));
		contacts.put("Sam",Arrays.asList("8989-7878", "2424-3636","8383-9292"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		//Sort and collect contacts map values into a list and print
		
	}

}
