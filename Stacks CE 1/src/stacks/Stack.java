package stacks;

public interface Stack {

	public abstract void push(String val) throws Exception;
	public abstract String pop() throws Exception;
	public abstract String peek() throws Exception;
}
