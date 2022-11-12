package assignment_set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStringOnlyWithGit {

	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<>(Arrays.asList("Git","Github","Gitlab","GitBash","Selenium","Maven","Java"));
		List<String> list2 = new ArrayList<String>();//new list to store searched values
		
		System.out.println("Initial Items in the list are "+list1);
		
		for (int i=0;i<list1.size();i++)
		{
			if(list1.get(i).startsWith("Git"))//searching each item in list for starting word "Git"
			{
				list2.add(list1.get(i));//Adding Items to new list list2
			}
		}
		System.out.println("After sorting the List with matching Items with Git "+list2);
		
	}

}
