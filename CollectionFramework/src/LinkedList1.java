import java.util.LinkedList;
import java.util.List;

/*********************************************************************
 * 
 * 
 * 
 * 
 * @author Aditya kumar, Lnkedlist learning
 *
 ********************************************************************/
class book {

	private String name;
	private int price;

	public book(String name, int price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "book [name=" + name + ", price=" + price + "]";
	}

}

public class LinkedList1 {

	public static void main(String[] args) {

//		LinkedList<String> contry = new LinkedList<>(); // creating a linked list

//		List<String> contry = new LinkedList<>(); // here we are using list interface(parent class)to LinkedList

//		contry.add("India"); // adding vlues to LinkedList
//		contry.add("Srilanka");
//		contry.add("Pakistan");
//		contry.add("China");
//		contry.add("Usa");
//		contry.add("Nepal");

//		for (String disp : contry) {
//			System.out.println(disp);
//		}

//		contry.set(2, "bhutan"); 	//addig value at particular index in LinkedList

//		System.out.println("=================");

//		for (String disp : contry) {
//			System.out.println(disp);
//		}

//		System.out.println("=====================");
//		contry.remove(2);	//removing value at index

//		for (String disp : contry) {
//			System.out.println(disp);
//		}

//		contry.removeFirst();	//removing first value in LinkedList
//		contry.removeLast();	//removing last value in LinkedList
//
//		for (String disp : contry) {
//			System.out.println(disp);
//		}

//		contry.addFirst("India");	//adding value at top of LinkedList
//		contry.addLast("Pakistan");	//adding value at bottom of LinkedList
//
//		System.out.println("=====================");
//		for (String disp : contry) {
//			System.out.println(disp);
//		}
//		System.out.println("=====================");
//		System.out.println(contry.pop()); // popping out value at top of index

		// Linked List array of a custom object

		List<book> notebook = new LinkedList<book>();

		book b1 = new book("incredible india", 500);
		book b2 = new book("jungle book", 250);
		book b3 = new book("Mind on", 600);
		book b4 = new book("pax indica", 555);

		notebook.add(b1);
		notebook.add(b2);
		notebook.add(b3);
		notebook.add(b4);

		for (book display : notebook) {
			System.out.println("Book name =" + display.getName() + "price: " + display.getPrice());
		}

	}

}
