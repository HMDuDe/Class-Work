package carstack;

public interface Stack<E> {

	public void push(Object obj) throws Exception;
	public E pop() throws Exception;
	public E peek() throws Exception;
}
