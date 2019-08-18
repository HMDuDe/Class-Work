package carstack;

public class MyStack<E> extends Car implements Stack{

	public MyStack(String model, String regNum) {
		super(model, regNum);
		// TODO Auto-generated constructor stub
	}

	private int count = 0;
	private Object[] arr = new Object[20];
	
	public static void main(String[] args) {
		
		MyStack allCars = new MyStack("BMW", "CA 1523513");
		
		for(int i = 0; i < 20; i++) {
			allCars.arr[i] = new Car("Toyota", "CA 523754");
		}
	}

	@Override
	public void push(Object obj) throws Exception {
		if(count == 0) {
			throw new Exception();
		}else {
			arr[count] = obj;
		}
	}

	@Override
	public E pop() throws Exception {
		if(count == 0) {
			throw new Exception();
		}else {
			Object result = arr[--count];
			arr[count] = 0;
			return (E) result;
		}
	}

	@Override
	public E peek() throws Exception {
		if(count == 0) {
			throw new Exception();
		}else {
			return (E) arr[count - 1];
		}
	}

}
