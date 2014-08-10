
import java.util.ArrayList;
import java.util.Arrays;


public class StackImpl1<E> implements Stack<E> {
	
    private ArrayList<E> stack;

    public StackImpl1() {
        stack = new ArrayList<>();
    }

	
	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		stack.add(element);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return stack.remove(stack.size() - 1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		stack.clear();
		
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return stack.get(stack.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	@Override
	public boolean duplicated(E element) {
		// TODO Auto-generated method stub
		if (stack.add(element)) {
			if (stack.contains(element)) {
				return true;
			}
		}
		return false;
	}
	
	
}