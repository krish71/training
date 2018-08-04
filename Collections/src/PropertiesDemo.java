import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		String file ="src/person.info";
		Properties p = new Properties();
		p.load(new FileReader(file));
		System.out.println("Name:"+p.getProperty("name"));
		System.out.println("DOB:"+p.getProperty("dob"));
		System.out.println("City:"+p.getProperty("city"));
		
	}

}
