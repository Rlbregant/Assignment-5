package com.coderscampus.arraylist;

import static org.junit.Assert.*;
import org.junit.Test;

public class CustomArrayListTest {

	@Test
	public void testGet() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Test getting element at index within bounds
		assertEquals(2, (int) list.get(1));

		// Test getting element at index 0
		assertEquals(1, (int) list.get(0));

		// Test getting element at index size - 1
		assertEquals(3, (int) list.get(2));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetOutOfBounds() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.get(-1);
	}

	@Test
	public void testGetMaxSize() {
		CustomArrayList<Integer> list = new CustomArrayList<>(20);
		assertEquals(20, list.getMaxSize());
	}

	@Test
	public void testRemove() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Test removing element at index within bounds
		assertEquals(2, (int) list.remove(1));
		assertEquals(2, list.getSize());

		// Test removing element at index 0
		assertEquals(1, (int) list.remove(0));
		assertEquals(1, list.getSize());

		// Test removing element at index size - 1
		assertEquals(3, (int) list.remove(0));
		assertEquals(0, list.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveOutOfBounds() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.remove(-1);
	}

	@Test
	public void testAdd() {
		CustomArrayList<Integer> list = new CustomArrayList<>();

		// Test adding to list
		assertTrue(list.add(1));
		assertEquals(1, list.getSize());
		assertEquals(1, (int) list.get(0));
	}

	@Test
	public void testAddWithIndex() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);

		// Test adding to index within bounds
		assertTrue(list.add(1, 4));
		assertEquals(4, (int) list.get(1));
		assertEquals(4, list.getSize());

		// Test adding to index 0
		assertTrue(list.add(0, 5));
		assertEquals(5, (int) list.get(0));
		assertEquals(5, list.getSize());

		// Test adding to last index
		assertTrue(list.add(list.getSize(), 6));
		assertEquals(6, (int) list.get(list.getSize() - 1));
		assertEquals(6, list.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddWithIndexOutOfBounds() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(-1, 1);
	}

	@Test
	public void testGetSize() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(3, list.getSize());
	}

	@Test
	public void testEnsureCapacity() {
		CustomArrayList<Integer> list = new CustomArrayList<>(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// Test capacity increase
		list.add(6);
		assertTrue(list.getMaxSize() > 5);

		// Test capacity not increase
		list.ensureCapacity(5);
		assertEquals(list.getMaxSize(), list.elements.length);
	}

}