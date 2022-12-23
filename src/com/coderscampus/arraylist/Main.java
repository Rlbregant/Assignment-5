package com.coderscampus.arraylist;

public class Main {
	public static void main(String[] args) {
		// Create a list using the CustomArrayList class
		CustomList<String> list = new CustomArrayList<>();

		// Add some elements to the list
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
		// Print the list size
		System.out.println("Size: " + list.size());

		// Print the list contents
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}