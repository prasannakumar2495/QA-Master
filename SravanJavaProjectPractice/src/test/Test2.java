package test;

public class Test2  extends Loops{
	
	{
		System.out.println("Instance Block from Child");
	}
	
	public static void main(String [] args)
	{
		Test2 t=new Test2();
		System.out.println(t.a);
	}
	
	Test2()
	{
		System.out.println("Con from Child");
	}
	
	static 
	{
		System.out.println("Statci from child");
	}
	
}
