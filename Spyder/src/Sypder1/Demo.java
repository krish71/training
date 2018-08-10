package Sypder1;

public class Demo<A> {
	private A data;

	public Demo(A data) {
		this.data = data;
	}

	public A getData() {
		return data;
	}

	public void setData(A data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");//generics
		System.out.println(d1.getData());
		Demo<String> d2 = new Demo<String>("");
		System.out.println(d2.getData());

	}
}
