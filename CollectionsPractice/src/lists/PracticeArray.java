package lists;

public class PracticeArray {
	public void practice() {
		String[] number = new String[5];
		number[0] = "dfgvfg";
		number[1] = "pk";
		number[2] = "641";
		number[3] = "9874198";
		number[4] = "9874189";
		// number[5] = "8941";
		for (int i = 0; i < 5; i++) {
			System.out.println("number " + "is " + number[i]);
		}
	}

	private void practice1() {
		int[] name = new int[] { 0, 1, 2, 3, 4 };
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i]);
		}
	}

	private String max(String[] name) {
		String testname = name[0];
		for (int i = 0; i < 4; i++) {
			String temp = name[i];
			if(temp.length()>testname.length())
			{
				testname = temp;
			}
			
		}
		return testname;
	}

	public static void main(String[] args) {
		PracticeArray PA = new PracticeArray();
		PA.practice();
		PA.practice1();
		String[] name = { "dfg", "gferg", "ergergvt", "ergthtrhtbtbtr" };
		String lname = PA.max(name);
		System.out.println("the longest string is "+lname);
	}
}
