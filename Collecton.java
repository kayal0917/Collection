package com.chaninsys.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collecton {

	public static void main(String[] args) {
//list
		System.out.println("list:");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("ash");
		arr.add("angel");
		arr.add("chechi");
		System.out.println(arr);// add (string)
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		for (int i = 1; i < 5; i++) {
			arr1.add(i);
		}

		System.out.println(arr1);// add(int)
		arr1.remove(3);
		System.out.println(arr1);// remove
		arr1.add(3, 4);
		System.out.println(arr1);// (int index,int object)
		arr1.clear();
		System.out.println(arr1);// clear
		System.out.println(arr1.isEmpty());// is empty
		for (int i = 1; i < 5; i++) {
			arr1.add(i);
			System.out.println(arr1);
			arr1.clone();
			System.out.println(arr1);// clone

			int size = arr1.size();
			System.out.println(size);// size
		}

		LinkedList<String> list = new LinkedList<String>();

		list.add("linked");
		list.add("List");
		list.add("linkedList");
		System.out.println(list);// LinkedList
		System.out.println(list.get(1));// fetching
		list.add("collection");
		list.add(2, "collect");
		System.out.println(list);// add list
		System.out.println(list.contains("collect"));// contains
		System.out.println(list.set(1, "collect"));// set

		System.out.println(list);
		ListIterator iterator = list.listIterator(2);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());// iterator
		}

		Vector<String> vector = new Vector<String>();
		vector.add("vidhya");
		vector.add("abi");
		vector.add("ram");
		vector.add("anitha");
		System.out.println(vector);
		vector.add("kumar");
		System.out.println(vector);
//		vector.clear();
		System.out.println(vector.set(2, "abirami"));
		System.out.println(vector);// set vector
		System.out.println(vector.isEmpty());// is empty
		Vector<String> number = new Vector<String>();
		number.add("10");
		number.add("20");
		number.add("30");
		number.add("40");
		number.add("50");
		number.add("60");
		System.out.println(number);
		for (int index = number.size() - 1; index >= 0; index--) {
			System.out.println(number.get(index));// reverse order
		}
		System.out.println("**********");
		ListIterator<String> iterator1 = number.listIterator(number.size());
		while (iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());// ListIterator
		}
		Vector<Integer> Vector = new Vector<Integer>();
		Vector.add(67);
		Vector.add(97);
		Vector.add(77);
		Vector.add(37);
		Vector<Integer> Vector1 = new Vector<>(Vector);
		for (Integer value : Vector1) {
			System.out.println(value);// one by one using add method
		}
		Vector<Integer> Vector2 = new Vector<Integer>();
		Vector2.add(45);
		Vector2.add(55);
		Vector2.add(65);
		Vector2.add(75);
		System.out.println(Vector2);//

		int minNumber = Collections.min(Vector2);
		int maxNumber = Collections.max(Vector2);
		System.out.println(maxNumber);
		System.out.println(minNumber);

//stack

		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");

		System.out.println(stack);
		System.out.println(stack.peek());// peek
		System.out.println(stack.search("b"));//search
		System.out.println(stack.isEmpty());// stack
		stack.pop();
		System.out.println(stack);// pop
		HashSet hs=new HashSet();
		for(int i=1;i<=5;i++) {
			hs.add(i);
		}
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.hashCode());
		System.out.println(hs.contains(5));
		TreeSet tree=new TreeSet();
		for(int i=5;i<=5;i++) {
			tree.add(i);
		}

		System.out.println(tree.clone());
		System.out.println(tree.contains(5));
		System.out.println(tree.hashCode());
		System.out.println(tree.size());
		System.out.println(tree.isEmpty());




	}
}