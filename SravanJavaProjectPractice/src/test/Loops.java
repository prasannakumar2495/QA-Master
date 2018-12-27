package test;


public  class Loops  {
	
	public static void main(String [] args )
	{
		
		for (int a=1;a<=4;a++)
		{
			//System.out.println(a);
			for(int b=3;b>=a;b--)
			{
			System.out.print(" ");
			
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("*");
			}
			for(int d=2;d<=a;d++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
