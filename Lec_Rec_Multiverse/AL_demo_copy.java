package Lec_Rec_Multiverse;

import java.util.ArrayList;
import java.util.List;

public class AL_demo_copy {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		AL.add("as1");
		AL.add("as2");
		AL.add("as3");
		AL.add("as4");

		System.out.println(AL);
		List<String> AL_1 = new ArrayList<>(AL);
		System.out.println(AL_1);
		
		
		System.out.println(AL==AL_1);

		AL_1.add("hauhau");
		
		System.out.println(AL_1);
		System.out.println(AL);
		
		
	}
}
