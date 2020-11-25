import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Tweb extends Thread {
     
	private Socket web;
	public Tweb(Socket web) {
		this.web=web ;
	}
	public void run() {

		BufferedReader inputStream = null;
		File index = new File("C:\\Users\\HP\\eclipse-workspace\\TP3web2\\src\\web.html");
		try {
			inputStream = new BufferedReader(new FileReader(index));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out;
		try {
			out = new
					PrintWriter(web.getOutputStream(), true);
		

	
    out.println("HTTP/1.1 200 OK");
    out.println("Content-Type: text/html");
    out.println("Content-Length: " + index.length());
    out.println("\n\n");
 //   out.println("<html>hello</html>");

String c=inputStream.readLine();
	while(c  != null) {
	
		out.println(c);
		//System.out.println(c);
		c=inputStream.readLine();
	}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}
