import java.io.Serializable;

public class Student implements Serializable {
private int mat,sci,eng;
private  transient int total;

public Student() {
	
}

public Student(int mat, int sci, int eng) {
	this.mat = mat;
	this.sci = sci;
	this.eng = eng;
	total=mat+sci+eng;
}
public void result() {
	System.out.println("Maths: "+mat);
	System.out.println("Science: "+sci);
	System.out.println("English: "+eng);
	System.out.println("Total: "+total);
	
}

}
