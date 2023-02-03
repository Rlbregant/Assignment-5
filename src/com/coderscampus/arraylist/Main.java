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
		
		list.remove(9);
		list.add(7, "afadgdsfghdfhgd");
		list.remove(9);
		list.add("aefesfhgetghrt");
		list.add(7, "sfgfgjtyjm");
		list.add("11");
		list.remove(9);
		
		// Print the list size and current max size
		System.out.println("Size of list: " + list.getSize());
		System.out.println("Max size: " + list.getMaxSize());

		// Removes an item from the list
		try {
		    list.remove(1);
		} catch (IndexOutOfBoundsException e) {
		    System.out.println("Error: Invalid index.");
		}
						
		// Print the list contents
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
			
		}
		// Print the Object in slot "0" of the list
		System.out.println(list.get(0));
		
		// Print the list size and current max size
		System.out.println("Size of list: " + list.getSize());
		System.out.println("Max size: " + list.getMaxSize());
	}
}