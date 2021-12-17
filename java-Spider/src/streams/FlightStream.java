package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStream {
	public static void main(String[] args) throws Exception {
		List<Flight> flight=null;
		Stream<String> lines=Files.lines(Paths.get("src/flights.txt"));
		flight=lines.map(l->{
			String[] a=l.split(",");
			return new Flight(Integer.parseInt(a[0]),a[1],a[2],a[3]);
		}).collect(Collectors.toList());
		flight.forEach(System.out::println);
		
		// print details of flight  no 123
		System.out.println(flight.stream().filter(f->123==f.getCode()).findFirst().get());
		
		//print all flight of jet carrier
		flight.stream().filter(f->f.getCarrier().equals("Jet")).collect(Collectors.toList()).forEach(System.out::println);
		
		//print flight by their route
		flight.stream().filter(f->f.getSource().equals("Kochi")&& f.getDestination().equals("Kolkata"))
		              .collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
