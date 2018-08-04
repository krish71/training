import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println("--Iterating over vector using for each");
		for (String elem : v)
			System.out.println(elem);

		System.out.println("--Iterating over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Appache");
		lst.addFirst("Apple");

		v.addAll(lst); // merging list into vector
		System.out.println("--iterating over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);
		// Colnverting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("--Iterating over Hashset using For each");
		for (String elem : set)
			System.out.println(elem);
		// Colnverting Set into Treeset
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("--Iterating over Treeset using For each");
		for (String elem : tree.descendingSet())
			System.out.println(elem);
		//New Way to iterate from Java 8
		System.out.println("--Iterating over Treeset using Java 8 ForEach()");
		tree.forEach(System.out::println);
		//Converting Array to List
		String[] week = {"Sun","Mon","Tues","Wed"};
		List<String> days =Arrays.asList(week);
		days.forEach(System.out::print);
	}

}
