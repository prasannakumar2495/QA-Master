package javapractice_bench;


public class MethodsandConstructors 
{
	//default initialization is only possible for instance varibles.
	static 	String data = "sita";

	//instance variable is an variable that is declared in the class.
	//local variable is declared with in the method.

	//a constructor will be named with the same name as the class, we can give parameters with the constructors. 
	//this will not have any return type,not even 'void'.

	public MethodsandConstructors()
	{
		System.out.println("this constructor is created to avoid the parametarizartion for the exted class.");
	}
	public MethodsandConstructors(String constr)
	{
		//here we have created an local variable 'data' again.
		String data = "prasanna kumar";
		//the value 'sita' was passed into the parameter 'constr'.
		this.data=constr;
		System.out.println(constr + " "+data);
	}
	
	//CONSTRUCTOR OVERLOADING
	public MethodsandConstructors(String constr1, int i)
	{
		System.out.println(constr1+" "+ i);
	}

	//'this' keywod is used to locate the instance/public variable. this should be stored in a variable.
	//we cannot use 'this' keyword in the static.
	public void Method()
	{
		System.out.println("this method is created to inherit in the extented class for expalining inheritance.");
	}
	public void Method( String d)
	{
		this.data = d;
		int data = 10;
		System.out.println(d);
		System.out.println(data);
	}
	
	// METHOD OVERLOADING
	public void Method1(String d1 , int i)
	{
		this.data=d1;
		System.out.println(d1 +" "+ 1);
	}
	
	
	
	public static void main(String[] args) 
	{
		//when ever an default constructor is created in the class, the outsput's in the constructors created will be executed. 
		MethodsandConstructors ftb = new MethodsandConstructors(data);
		//so this default constructor will execute the abover mentioned constructor.
		
		//the value passed to the method variable is 'ram'. so the value of the 'data' has been change to ram which was earlier 'sita'.
		ftb.Method("ram");
		//the values that we pass inside the constructor will be used by the constructor o/p and the values that we pass during the 
		//calling of the method will be used by the method during its execution.
		MethodsandConstructors ftb1 = new MethodsandConstructors("constructor overloading", 1);
		ftb1.Method1("method overloading", 1);

	}
}
