package training.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String qcn = "training.reflect.Customer";

		// Manually loading the class
		Class custClass = Class.forName(qcn);

		// Getting the parameterized constructor
		Constructor custConst = custClass.getConstructor(String.class);

		// Instantiating with parameterized constructor
		Object obj = custConst.newInstance("Nilesh");
		System.out.println(obj);
		
		//getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print", null);
		
		//calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj,null);
	}

}
