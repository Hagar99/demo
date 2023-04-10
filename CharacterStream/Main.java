package CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		int content;
		FileReader inStream = null;
		FileWriter outStream = null;
		
		try	{
		
			inStream = new FileReader("/home/hajar/Desktop/source.txt");
			outStream = new FileWriter("/home/hajar/Desktop/dest.txt");
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
