
public class Demo<Z> {
	
	private Z data;
	 public Demo(Z data) {
		 this.data=data;
	 }
	 public Z getData() {
		 return data;
	 }
	 public void setData(Z data) {
		 this.data=data;
	 }
	 public static void main(String[] args) {
		Demo<String> d1=new Demo<String>("Hello");
		System.out.println(d1.getData());
		
		Demo<Integer> d2=new Demo<Integer>(100);
		System.out.println(d2.getData());
	}
//	private Object data;
//	
//	public Demo(Object data) {
//		this.data=data;
//	}
//	public Object getData() {
//		return data;
//	}
//	public void setData(Object data) {
//		this.data=data;
//	}
//	public static void main(String[] args) {
//	   Demo d1=new Demo("Hello");
//	   d1.setData(12.50);
//	   System.out.println(d1.getData());
//	   
//	   Demo d2=new Demo(100);
//	   d2.setData("Hey");
//	   System.out.println(d2.getData());
//	}

}
