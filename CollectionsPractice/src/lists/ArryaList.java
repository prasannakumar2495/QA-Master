package lists;

import java.util.ArrayList;

public class ArryaList 
{
	public static ArrayList<String> arrayPK(ArrayList<String> object) 
	{
		ArrayList<String> names1 = new ArrayList<>();
		//we have used the addAll method so as to add all the names passed the object
		names1.addAll(object);
		return names1;
		
		
	}
	public static void main(String[] args) 
	{
		ArryaList pk = new ArryaList();
		ArrayList<String> object = new ArrayList();
		object.add("prasanna");
		object.add("kumar");
		
		System.out.println(arrayPK(object));
	}

}
