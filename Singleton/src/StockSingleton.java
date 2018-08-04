
public class StockSingleton {

	public static void main(String[] args) {
		
		Stock a = Stock.getInstance();
		System.out.println(a);
		Stock b = Stock.getInstance();
		System.out.println(b);
		Stock c = Stock.getInstance();
		System.out.println(c);

	}

}
