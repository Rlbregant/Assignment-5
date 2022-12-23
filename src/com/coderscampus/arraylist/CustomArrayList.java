package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;
	private int size;

	public CustomArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public CustomArrayList(int capacity) {
		elements = new Object[capacity];
	}

	@Override
	public void add(T element) {
		ensureCapacity(size + 1);
		elements[size++] = element;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return (T) elements[index];
	}

	@Override
	public int size() {
		return size;
	}

	private void ensureCapacity(int minCapacity) {
		if (minCapacity > elements.length) {
			int newCapacity = Math.max(elements.length * 2, minCapacity);
			elements = Arrays.copyOf(elements, newCapacity);
		}
	}
}
