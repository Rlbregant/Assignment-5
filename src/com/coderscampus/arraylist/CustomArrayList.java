package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private static final int DEFAULT_CAPACITY = 10;
	Object[] elements;
	private int size;
	int maxSize = DEFAULT_CAPACITY;

	public CustomArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public CustomArrayList(int capacity) {
		elements = new Object[capacity];
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
	public int getMaxSize() {
		return maxSize;
	}

	void ensureCapacity(int minCapacity) {
		if (minCapacity > elements.length) {
			int newCapacity = Math.max(elements.length * 2, minCapacity);
			elements = Arrays.copyOf(elements, newCapacity);
			maxSize = newCapacity;
		}
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		@SuppressWarnings("unchecked")
		T removedElement = (T) elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return removedElement;
	}

	@Override
	public boolean add(T item) {
	    ensureCapacity(size + 1);
	    elements[size++] = item;
	    return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
	    if (index > size || index < 0) {
	        throw new IndexOutOfBoundsException();
	    }
	    ensureCapacity(size + 1);
	    for (int i = size; i > index; i--) {
	        elements[i] = elements[i - 1];
	    }
	    elements[index] = item;
	    size++;
	    return true;
	}

	@Override
	public int getSize() {
		return size;
	}
}