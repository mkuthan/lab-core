package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StackTest {

	@Test
	public void push() {
		// given
		Stack stack = new StackImpl();

		// when
		stack.push(new Object());

		// then
		assertFalse(stack.is_empty());
	}

	@Test
	public void push15() {
		// given
		Stack stack = new StackImpl();

		// when
		for (int i = 0; i < 15; i++) {
			stack.push(new Object());
		}

		// then
		assertFalse(stack.is_empty());
	}

	@Test
	public void pop() throws Exception {
		// given
		Stack stack = new StackImpl();
		Object element = new Object();
		stack.push(element);

		// when
		Object popElement = stack.pop();

		// then
		assertEquals(element, popElement);
	}

	@Test(expected = Exception.class)
	public void popEmpty() throws Exception {
		Stack stack = new StackImpl();
		stack.pop();
	}

}
