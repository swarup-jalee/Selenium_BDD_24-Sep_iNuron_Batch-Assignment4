package assignment_set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<>(Arrays.asList("Java","Selenium","TestNG","Git","Github"));
		System.out.println("Before Reversing the List "+list1);
		Collections.reverse(list1);
		System.out.println("Afer Reversing the List "+list1);
	}

}
