package lists;

import java.util.Collection;
import java.util.Vector;

public class PracticeVector {
	private Vector<String> practice(Vector<String> newele) {
		Vector<String> v = new Vector(3, 3);
		v.addAll(newele);
		Vector<String> v_clone = (Vector<String>) v.clone();
		System.out.println(v_clone);
		return v;
	}
	public static void main(String[] args) {
		Vector<String> newele = new Vector();
		newele.add("pjk");
		newele.add("kp");
		newele.add("prasanna kumar");
		newele.add("ergttr");
		newele.add("ergergergverg");
		PracticeVector p = new PracticeVector();
		System.out.println(p.practice(newele));
	}
}
