package Lec_16;

public class Wrapper_class_demo {
	public static void main(String[] args) {
		int i = 10; // fn frame
		Integer I = 100; //heap
		
//		System.out.println(I+5);
//		i = I; // unboxing!! heap to stack
//		System.out.println(i);
		I = i; // stack to heap !! autoboxing!
		System.out.println(I);
	}
	
}
