
public class CmdLineArgs {
	public static void main(String[] args) {
		
		int total=0;
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	    for (String s : args) {
	    	total+=Integer.parseInt(s);
			}
	    System.out.println("total:"+total);
	    
	    int x=10;//primitive variable
	}

}
