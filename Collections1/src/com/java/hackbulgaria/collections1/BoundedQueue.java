package com.java.hackbulgaria.collections1;

import java.util.LinkedList;

public class BoundedQueue<E> extends LinkedList<E> {
	
	private int limit;
	
	public BoundedQueue(int limit) {
		this.limit = limit;
	}
	
	public boolean offer(E element) {
		super.add(element);
		while (size() >= limit) {
			super.remove();
		}
		return true;
	}
}
