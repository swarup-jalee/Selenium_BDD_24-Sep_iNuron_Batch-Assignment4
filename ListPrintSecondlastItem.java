package assignment_set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrintSecondlastItem {

	public static void main(String[] args) {
		List<Integer> list1 =  new ArrayList<>(Arrays.asList(10,45,90,45,23,90,44));
		List<Integer> list2= new ArrayList<>();
		System.out.println("Original List Contains "+list1);
		//getting the 2nd and second last Items from list based on Index
			list2.add(list1.get(1));
			list2.add(list1.get(list1.size()-2));
		
		System.out.println("New list after taking 2nd and Second Last Item");
		System.out.println(list2);
	}

}
