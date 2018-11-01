package javapractice_bench;


//a only final class cannot be extended or inherited but final methods and final variables can be inherited.
//private variables cannot be inherited
public class InheritanceTest extends MethodsandConstructors
{
	//CONSTRUCTOR CHAINING
	public InheritanceTest()
	{
		//this should be the 1st executable statement in the code.(i.e: super() )
		super();//this keyword will call the constructor in the super class, with zero parameters.
		//each constructor can call only a single super class constructor.
		super.data = "inherited";
		System.out.println(super.data);
	}
	//only methods and variable can be inherited but not constructors.
	//we can call the methods/variables in the parent class by either creating an reference or by 'super' key word.
	//method overriding will be possible only if they are of same parameters, access modifier or higher visibility and same return type.
	//method overriding is possible only incase of inheritance.
	
	public InheritanceTest(int i)
	{
		//this() will be used to call the constructors in the same class.
		this();
		System.out.println("2nd constructor");
	}
	public InheritanceTest(String pk)
	{
		//super() will be used to call the constructors in the parent/super class.
		super();
		
	}
	@Override
	public void Method()
	{
		System.out.println("this is the inherited method from the parent class.");
		super.Method();
	}


	public static void main(String[] args) 
	{
		InheritanceTest inht = new InheritanceTest();
		inht.Method("called from the parent class");
		inht.Method();
		InheritanceTest inht1 = new InheritanceTest(0);
		InheritanceTest inhts = new InheritanceTest(null);

	}
}
