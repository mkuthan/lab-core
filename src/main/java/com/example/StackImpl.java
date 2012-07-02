package com.example;

import java.util.Date;

public class StackImpl implements Stack {

	private Object[] items;
	private int size = 0;

	public StackImpl() {
		this(10);
	}

	public StackImpl(int initialCapacity) {
		items = new Object[initialCapacity];
	}

	public void push(Object x) {
		if (size + 1 == items.length) {
			int oldSize = items.length;
			Object[] newItems = new Object[oldSize * 2];

			for (int i = 0; i <= oldSize; i++)
				newItems[i] = items[i];
			items = newItems;
		}

		size++;
		items[size] = x;
	}

	public Object pop() throws Exception {
		if (size == 0) {
			throw new Exception("Stack pop");
		}

		return items[size--];
	}

	public boolean is_empty() {
		return size == 0;
	}
}
