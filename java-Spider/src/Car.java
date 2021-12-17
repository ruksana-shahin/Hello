
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String... features) {//varargs
		this.model=model;
		this.features=features;
	}
	public void specs() {
		System.out.println("Features of"+model);
		for (String f : features) {
			System.out.println(" _ "+f);
		}
	}
	      public static void main(String[] args) {
	    	  Car alto=new Car("Suzuki Alto","power steering","power windows","airbags");
	    	  alto.specs();
	    	  
	    	  Car astor=new Car("MG Astor","keyless","sunroof","ABS","traction ctrl");
	    	  astor.specs();
	      }
	    	  
	      

}

