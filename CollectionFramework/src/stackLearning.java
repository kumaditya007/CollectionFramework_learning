import java.util.Stack;

/*************************************************************************************
 * 
 * 
 * @author kumaditya007, Stack operation
 *
 ***************************************************************************************/

public class stackLearning {

	public static void main(String[] args) {

		Stack<Integer> list = new Stack<>(); // creating a stack
		list.push(12); // pushing value into stack
		list.push(13);
		list.push(14);
		list.push(15);
		list.push(16);
		list.push(17);

		for (Integer itr : list) { // for-each loop
			System.out.println(itr);
		}
		System.out.println("===========");
		System.out.println(list.pop()); // popping value out of stack

		System.out.println("============");
		System.out.println(list.peek()); // return the element at the top of stack

		System.out.println("=============");
		System.out.println(list.search(14)); // searching a value in the stack

		System.out.println("==============");
		System.out.println(list.size());

	}

}
