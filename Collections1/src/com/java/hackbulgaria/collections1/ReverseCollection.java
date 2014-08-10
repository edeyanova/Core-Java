package com.java.hackbulgaria.collections1;

import java.util.Collection;
import java.util.Stack;

public class ReverseCollection {
	public <T> void reverse(Collection<T> collection){
		Stack<T> stack = new Stack<>();
		for(T item: collection){
			stack.push(item);
		}
		collection.clear();
		while(!stack.isEmpty()){
			collection.add(stack.pop());
		}

	}
}
