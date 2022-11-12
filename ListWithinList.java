package assignment_set4;

import java.util.ArrayList;
import java.util.Arrays;


public class ListWithinList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> listAll= new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(11,22,33));
		ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(9,19,29));
		ArrayList<Integer> l3=new ArrayList<>(Arrays.asList(7,17,27));
		listAll.add(l1);
		listAll.add(l2);
		listAll.add(l3);
	System.out.println("List of Arrays elements in new List are "+listAll);
	
		
		
	}

}
