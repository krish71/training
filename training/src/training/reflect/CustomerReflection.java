package training.reflect;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;
public class CustomerReflection {

	public static void main(String[] args) {
		Customer c1 = new Customer("Polo");
		System.out.println(c1);
		
		Class cc= c1.getClass();
		System.out.println(cc);
		System.out.println("List of constructors");
		Constructor[] constructors = cc.getConstructors();
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		System.out.println("--List of methods");
		Method[] decMethods=cc.getDeclaredMethods();
		for(Method m :decMethods) {
			System.out.println(m);
		}
		System.out.println("--List of fields");
		java.lang.reflect.Field[] fields=cc.getDeclaredFields();
		for(java.lang.reflect.Field f :fields) {
			System.out.println(f);
		}
		
	}

}
