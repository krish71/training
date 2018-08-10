package Sypder1;

public class Car {
private String model;
private String[] features;

public Car(String model,String ...features) {
	this.model=model;
	this.features=features;
}
public void specs() {
	System.out.println("Features of:"+model);
	for(String feature: features)
		System.out.println(feature);
}

//using arrays
public static void main(String[] args) {
	String[] altof = {"Power Steering","Power Window","Keyless Entry"};
	Car alto =new Car("Alto",altof);
	alto.specs();
	
	//varargs
	String[] jazzf = {};
	Car jazz =new Car("Alto","Keyless Start","ABS","Power Window","Keyless Entry");
	alto.specs();
	
	
}
}
