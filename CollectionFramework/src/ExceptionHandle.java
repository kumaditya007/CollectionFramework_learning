/******************************************************
 * 
 * 
 * 
 * 
 * @author Aditya kumar, kumaditya007@gmail.com
 *
 *******************************************************/

/*
 * public class ExceptionHandle {
 * 
 * public static void main(String[] args) {
 * 
 * try { int n1, n2, result;
 * 
 * n1 = Integer.parseInt(args[0]); n2 = Integer.parseInt(args[1]);
 * 
 * result = n1 / n2;
 * 
 * } catch (ArrayIndexOutOfBoundsException ex) {
 * 
 * System.out.println("ArrayIndexOutOfBoundsException"); ex.printStackTrace(); }
 * 
 * catch (NumberFormatException ex) {
 * 
 * System.out.println("NumberformatException" + ex.getStackTrace()); } catch
 * (ArithmeticException ex) {
 * 
 * System.out.println("ArithmeticException"); ex.printStackTrace(); } finally {
 * 
 * System.out.println("Exception handled"); } } }
 */

// Throws demonstation

/*
 * 
 * class ExceptionHandle { int a, b, c;
 * 
 * void set(String arr[]) throws ArrayIndexOutOfBoundsException,
 * NumberFormatException { a = Integer.parseInt(arr[0]); b =
 * Integer.parseInt(arr[1]); }
 * 
 * void divide() throws ArithmeticException { c = a / b; // process }
 * 
 * void display() { System.out.println(a + " / " + b + " = " + c); }
 * 
 * public static void main(String args[]) { System.out.println("===========");
 * try { ExceptionHandle e2 = new ExceptionHandle(); try { e2.set(args); } catch
 * (NumberFormatException ex) {
 * System.out.println("Invalid Input, Using default values 10,2"); e2.a = 10;
 * e2.b = 2; }
 * 
 * e2.divide(); e2.display();
 * 
 * } // try catch (ArrayIndexOutOfBoundsException ex) {
 * System.out.println("Insufficient Input"); } catch (ArithmeticException ex) {
 * System.out.println("INFINITY"); } finally { System.out.println("IN FINALLY");
 * } System.out.println("==========="); }// main }// EDemo1
 * 
 * 
 */

/*********** Custom Exception **************/

class MyException extends Exception {

	String errDetail;

	public MyException(String msg) {

		this.errDetail = msg;
	}

	@Override
	public String getMessage() {

		return errDetail;
	}

	@Override
	public String toString() {

		return errDetail;
	}

}

class ExceptionHandle {

	int age;

	public ExceptionHandle(int age) throws MyException {

		setAge(age);
	}

	public void setAge(int age) throws MyException {
		if (age < 18 || age > 60) {
			MyException ex = new MyException("Age Limit not fit for job");
			throw ex;
			// throw new MyException("Age Limit not fit for job"); //other way of throwing
			// object

		} else {
			System.out.println("Valid age for job");
		}
	}

	void display() {

		System.out.println("Age : " + age);

	}

	public static void main(String[] args) {

		try {
			ExceptionHandle ex1 = new ExceptionHandle(70);
			// ex1.display();
		} catch (NumberFormatException ex) {

			System.out.println("Invalid input");
		} catch (Exception e) {
			System.out.println("Invalid input1");
		} finally {
			System.out.println("handled all exceptions");
		}
	}

}
