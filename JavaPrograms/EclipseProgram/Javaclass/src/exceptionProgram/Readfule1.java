package exceptionProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Readfule1 {

	public static void Readdata() throws FileNotFoundException {
		File fis=new File("f://Text.txt");	
		FileReader fir=new FileReader(fis);
	}

}
