package FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopier {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fin = new FileInputStream("test1");
		Scanner sc = new Scanner(fin);
		
		FileOutputStream fout = new FileOutputStream("test2");
		PrintWriter p = new PrintWriter(fout);
		
		while(sc.hasNextLine())
		{
			p.println(sc.nextLine());
		}
		p.close();

	}

}
