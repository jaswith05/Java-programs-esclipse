package practice;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling
{
public static void main(String[] args)
{
try {
	Scanner sc= new Scanner(System.in);
	File f= new File("jaswith.txt");
	f.createNewFile();
	FileWriter w= new FileWriter("jaswith.txt");
	w.write("hi i am jaswith\n");
	
	System.out.println("Enter the text: ");
	String s=sc.next();
	w.write(s);
	w.close();
	
	FileReader fr= new FileReader("jaswith.txt");
	int ch;
	while((ch=fr.read())!=-1) {
		System.out.print((char)ch);
	}
	fr.close();
	
	BufferedReader br= new BufferedReader(new FileReader("jaswith.txt"));
	
	String S;
	while((S=br.readLine())!=null) {
		System.out.println(S);
	}
	br.close();
	
	FileWriter append= new FileWriter("jaswith.txt", true);
	append.write("\nThis is appended statement");
	append.close();
	
	System.out.println(f.exists());
	
	sc.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
}
 
}