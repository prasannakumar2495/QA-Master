package lists;

import java.util.Collection;
import java.util.Vector;

public class PracticeVector {
	Vector<String> v = new Vector(3, 3);
	private Vector<String> practice(Vector<String> newele) {
		
		v.addAll(newele);
		Vector<String> v_clone = (Vector<String>) v.clone();
		System.out.println(v_clone+" these are the cloned elements");
		return v;
	}
	private void practiceElements() {
		for(int i=0;i<4;i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
	public static void main(String[] args) {
		Vector<String> newele = new Vector();
		newele.add("pjk");
		newele.add("kp");
		newele.add("prasanna kumar");
		newele.add("ergttr");
		newele.add("ergergergverg");
		PracticeVector p = new PracticeVector();
		System.out.println(p.practice(newele)+ " these are the new elements");
		p.practiceElements();
	}
}
