@FunctionalInterface

public interface Hello {
	String sayHello();
	
	default String sayBye() {
		return "Good bye";
	}
	static void greet() {
		System.out.println("Bonjour la Monde");
	}
}
