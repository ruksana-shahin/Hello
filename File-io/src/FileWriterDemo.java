import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path="C:\\hello";
		BufferedWriter writer=null;
		
		try {
			writer=new BufferedWriter(new FileWriter(path, true));
			writer.write("When i see your face");
			writer.newLine();
			writer.write("Thare is not a thing that i would change");
			writer.newLine();
			writer.write("Cause you are  amazing, just the way you are");
			System.out.println("Writing to file completed.."); 
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null)
					writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
