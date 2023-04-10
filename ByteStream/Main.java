package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int content;
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		
		try	{
		
			inStream = new FileInputStream("/home/hajar/Desktop/source.txt");
			outStream = new FileOutputStream("/home/hajar/Desktop/dest.txt");
			while ((content = inStream.read()) != -1) {
				outStream.write(content);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(inStream != null)
				inStream.close();
			if(outStream != null)
				outStream.close();
		}
	}
}
