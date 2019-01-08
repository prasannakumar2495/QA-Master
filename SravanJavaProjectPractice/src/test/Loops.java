package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public  class Loops  {
	
	public static void main(String [] args ) throws IOException
	{
		
		/*File f=new File("path of the IO");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);*/
		
		File f= new File("Users/prasannakumaranisetti/Movies/GIT/QA-Master/SravanJavaProjectPractice⁩/src/test");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.append('T');
		bw.newLine();
		bw.write("Sravan kumar Kora");
		
	}

}
