package com.coderscampus.arraylist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomArrayListTest {

	@Test
	public void testAdd() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("1");
		assertEquals(1, list.getSize());
		list.add("2");
		assertEquals(2, list.getSize());
	}

	@Test
	public void testGet() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals("2", list.get(1));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGet_throwsIndexOutOfBoundsException() {
		CustomList<String> list = new CustomArrayList<>();
		list.get(0);
	}

	@Test
	public void testRemove() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals("2", list.remove(1));
		assertEquals(2, list.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemove_throwsIndexOutOfBoundsException() {
		CustomList<String> list = new CustomArrayList<>();
		list.remove(0);
	}

	@Test
	public void testSize() {
		CustomList<String> list = new CustomArrayList<>();
		assertEquals(0, list.getSize());
		list.add("1");
		assertEquals(1, list.getSize());
	}

	@Test
	public void testGetMaxSize() {
		CustomList<String> list = new CustomArrayList<>();
		assertEquals(10, list.getMaxSize());
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		assertEquals(20, list.getMaxSize());
	}
}
