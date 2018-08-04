
public final class Stock implements Exchange {
	static Stock obj;

	private Stock() {

	}

	public static Stock getInstance() {
		if (obj == null) {
			obj = new Stock();
		}
		return obj;

	}

}
