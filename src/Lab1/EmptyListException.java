package Lab1;

public class EmptyListException {

	//public EmptyListException() {
		//super("List");
	//}

	public EmptyListException(String name) {
		System.err.println(name + " is empty");
	}
}