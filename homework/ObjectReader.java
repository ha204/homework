import java.io.BufferedReader;
import java.io.FileReader;
public class ObjectReader {
	
	
public static void main(String[] args) throws Exception
{	
	FileReader file = new FileReader("C:\\Users\\ha204\\BAE");
	BufferedReader reader = new BufferedReader(file);
	String text = "";
	String line = reader.readLine();
	while(line!=null){
		text = text+line    ;
		line = reader.readLine();
	}
	
System.out.println(text);
}





}