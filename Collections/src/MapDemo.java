import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String>  map = new HashMap<>();
		map.put("Jack", "jill");
		map.put("scott", "tiger");
		map.put("duke", "jave");
		map.put("Jack", "ji");
		
		for(String key : map.keySet())
			System.out.println(key + ": "+ map.get(key));
	}

}
