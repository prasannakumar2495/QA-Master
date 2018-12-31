package lists;

import java.util.Iterator;
import java.util.Vector;

public class practiceIterator {
	public static void main(String[] args) {
		Vector<String> v = new Vector(3, 3);
		v.addElement("prasanna");
		v.addElement("kumar");
		v.addElement("wrefrewf");
		v.addElement("rgreg");
		v.addElement("adewff");
		v.addElement("asdfd");
		v.addElement("qwe");
		v.addElement("asd");
		v.addElement("sdf");
		v.addElement("zxc");
		
		//all the methods of an iterator can be used only within the iterator, but not outside.
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			String value = it.next();
			System.out.println(value);
			
			if(value == "kumar")
			{
				break;
			}
		}
		
	}
}
