import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/****************************************************************************
 * 
 * @author kumaditya007@gmail.com, sample demos for ArrayList
 * 
 *****************************************************************************/
//import java.util.*;

public class ArrayList_learning {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Aditya");// adding objects
		list.add("Shiva");
		list.add("Javed");
		list.add("Ramesh");
		list.add("Suresh");
		list.add("Komal");
		// System.out.println(list);
		Iterator itr = list.iterator(); // iterator to traverse
		while (itr.hasNext()) { // checking if object is present
			System.out.println(itr.next()); // moving pointer to next index
		}
//		System.out.println("===============");
		for (String people : list) { // for each loop to traverse
//			System.out.println(people);
		}

//		System.out.println("===============");
//		System.out.println(list.get(1)); // get() method,accessing the element with index

//		System.out.println("===============");
		list.set(4, "santosh");
//		System.out.println("==========");
//		System.out.println(list);

//		System.out.println("===============");
		Collections.sort(list); // sorting of arraylist
//		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("manohar");
		list2.add("Ravi");
		list2.add("Shyam");
		list2.add("Aditya");
		list2.add("kumar");

//		list.addAll(list2); // adding ArrayList to the first arraylist

//		for (String display : list) {
//
//			System.out.println(display);
//		}

//		list.remove("Ramesh");
//		list.remove("Suresh");	//removing element with name 
//		list2.remove(0);		//removing element with index id
//
//		for (String display : list) {
//
//			System.out.println(display);
//		}
		System.out.println("==================");
//		System.out.println(list.retainAll(list2));
		System.out.println(list.isEmpty()); // check whether ArrayList is empty or not
	}

}
