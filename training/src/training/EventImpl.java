package training;

public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("first event implementation");
	}
public static class InnerEventImpl implements Event{
		public void doSomething() {
			System.out.println("Second event implementation");
		}
	}

	public void doingSomething() {
	class InnerMostImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Third Event Implementation");
		}
		
	}	
	new InnerMostImpl().doSomething();
	}
	//anonymous implementation
	public void doingSomethingAgain() {
		new Event() {

			@Override
			public void doSomething() {
				System.out.println("Forth Event Implementation.");
			}
			
		}.doSomething();
	}
	//lambda implementation
	public void doingSomethingOneLastTime() {
		Event e =()-> System.out.println("Fifth event implementation");
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventImpl impl =new EventImpl();
		impl.doSomething();
		
		//EventImpl.InnerEventImpl innerImpl = impl.new InnerEventImpl();
		InnerEventImpl innerImpl = new EventImpl.InnerEventImpl();
		innerImpl.doSomething();
		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();
	}

}
