
public class ChildDemo<Z, S> extends Demo<Z> {
	private S temp;

	public ChildDemo(Z data, S temp) {
		super(data);
		this.temp=temp;
	}
	public S getTemp() {
		return temp;
	}
	public void setTem(S temp) {
		this.temp=temp;
	}
	public static void main(String[] args) {
		ChildDemo<String, Integer> c1=new ChildDemo<String, Integer>("polo",22);
		System.out.println(c1.getData()+" "+c1.getTemp());
		
		ChildDemo<Integer,String> c2=new ChildDemo<Integer, String>(100,"mona");
		System.out.println(c2.getData()+" "+c2.getTemp());
	}

}
