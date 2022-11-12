package assignment_set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<>(Arrays.asList("Java","TestNG","Maven","Java"));
		System.out.println("Original list Contains "+list1);
		Set<String> remDuplicate = new LinkedHashSet<>();
		remDuplicate.addAll(list1);//convert array list to Set
		System.out.println("After Removing Duplicates" +remDuplicate);

	}

}
