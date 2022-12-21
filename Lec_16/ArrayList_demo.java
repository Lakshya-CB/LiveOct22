package Lec_16;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr.length);

		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(AL.size());
		System.out.println(AL);
		AL.add(10);
		System.out.println(AL);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		System.out.println(AL);
		System.out.println(AL.size());
//		indexing arr[i]
//		get = read element at index i !! AL.get(i)
		int data = AL.get(0);
		System.out.println(data);
		
		System.out.println(AL.get(AL.size()-1));
//		set => AL.set(i, ali)
		AL.set(0, 23);
		System.out.println(AL);
		AL.set(AL.size()-1,-1);
		System.out.println(AL);
		
//		add at index?!
		AL.add(1, 78);
		
		
	}
}
