package lists;

import java.util.LinkedList;

public class PracticeLinkedList {
	public static LinkedList<String> test(LinkedList<String> giveName) {
		LinkedList<String> name = new LinkedList<>();
		name.addAll(giveName);

		return name;

	}

	public static void main(String[] args) {
		LinkedList<String> giveName = new LinkedList<>();
		giveName.add("prasann");
		giveName.add("kumar");
		giveName.add("234");
		giveName.add("fgerg");
		giveName.add("34534");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");
		giveName.add("234");

		// checking any character
		Boolean status = giveName.contains("prasann");

		if (status) {
			System.out.println("the list contains the required character");
		} else {
			System.out.println("the required chracter is not there in the list");
		}
		// removing the elements from the list

		giveName.removeFirst();
		giveName.removeLast();
		giveName.remove(2);

		// get and set methods

		giveName.getFirst();
		giveName.get(0);
		giveName.set(0, "kp");

		// checking any character

		Boolean status1 = giveName.contains("prasann");

		if (status1) {
			System.out.println("the list contains the required character");
		} else {
			System.out.println("the required chracter is not there in the list");
		}

		System.out.println(PracticeLinkedList.test(giveName));
	}
}
