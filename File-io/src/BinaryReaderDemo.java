import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReaderDemo {
	public static void main(String[] args) {
		String path="C:\\hello";
		FileInputStream istream=null;
		try {
			istream=new FileInputStream(path);
			int ch=0;
			while(true) {
				ch=istream.read();//reading a byte from stream
				if(ch==-1)   //when end of file reached
					break;  // exit loop
				System.out.println((char)ch);
			}
			byte[] content= new byte[istream.available()]; //returns count of available bytes in stream
			istream.read(content); //reading bytes from stream into array
			System.out.println(new String(content));  //converting byte array to string
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				istream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
