
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class Copy {
		public static void main(String[] args) {
			FileInputStream inFile = null;
			FileOutputStream outFile = null;
			try {
				inFile = new FileInputStream("");//22 MB approx
				outFile = new FileOutputStream("C:/Users/002UMQ744/Documents/folder");
				System.out.println("Copying file.....");
				int ch = 0;
				long ms1 = System.currentTimeMillis();
				while(true) {
					ch = inFile.read();  //reading a byte from the stream
					if(ch == -1) break;
					outFile.write(ch);
				}
				long ms2 = System.currentTimeMillis();
				System.out.println("File copied successfully in " + (ms2-ms1) + " ms");
			}
			catch(IOException e) {
				System.out.println(e);
			}
			finally {
				try {
					inFile.close();
					outFile.close();
				} catch(Exception e) { }
			}
		}
	}


