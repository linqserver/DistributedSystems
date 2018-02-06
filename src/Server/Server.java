package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {

		Socket s;
		ServerSocket ss = new ServerSocket(2000);
		while (true) {
			System.out.println("Server: Waiting for connection ...");
			s = ss.accept();

			InputStream in = s.getInputStream();
			Scanner r = new Scanner(in);
			OutputStream o = s.getOutputStream();
			PrintWriter p = new PrintWriter(o);

			String inputLine;
			//while (r.hasNext()) 
			{
				inputLine = r.nextLine();

				p.println("Hello " + inputLine + " from Rafal's Server");
			}

			p.close();

		}

	}

}
