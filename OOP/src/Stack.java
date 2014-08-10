
public interface Stack<E> {
	void push(E element);
	E pop();
	int size();
	void clear();
	E peek();
	boolean isEmpty();
	boolean duplicated(E element);
}
