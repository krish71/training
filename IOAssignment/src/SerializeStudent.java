import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeStudent  {

	public static void main(String[] args) throws Exception{
		Student polo =new Student(37,39,36);
		polo.result();
		
		String file="C:/Users/AE206_PC12/Desktop/IOAssignment/src/Student.dat";
		FileOutputStream fstream =new FileOutputStream(file);
		ObjectOutputStream ostream=new ObjectOutputStream(fstream);
		ostream.writeObject(polo);//student serialized
		ostream.close();
		fstream.close();
		
		//Deserialization code
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
		Object obj =istream.readObject();
		Student student =(Student)obj;
		student.result();
		istream.close();
	}

}
