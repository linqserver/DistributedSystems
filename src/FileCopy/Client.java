package FileCopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
	
	
		//InetAddress inet = InetAddress.getByName("localhost");192.168.23.166
		InetAddress inet = InetAddress.getByName("192.168.23.165");
		Socket s = new Socket(inet, 2000);
		
		InputStream in = s.getInputStream();
		Scanner r = new Scanner(in);
				
		
		
		FileOutputStream fout = new FileOutputStream("test3");	
		PrintWriter pf = new PrintWriter(fout);
	
		
		while(r.hasNextLine()){
			String inputLine = r.nextLine();
			pf.println(inputLine);
			System.out.println("Client: " + inputLine);
		}
		pf.close();
		

	}

}
