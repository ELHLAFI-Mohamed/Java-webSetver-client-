import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(8000);
		String g="HTTP/1.0 200 OK\n\n "+"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"body {background-color: powderblue;}\r\n" + 
				"h1   {color: red;}\r\n" + 
				"p    {color: red;}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>This page was sent by my Server  </h1>\r\n" + 
				"<p>Welcome </p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		while(true) {
			System.out.println("Waiting for a clinet .......");
        Socket web=server.accept();
        System.out.println("New client ");
        PrintWriter out = new PrintWriter(web.getOutputStream(), true) ;
		out.println(g);
		
		
		
		}
	}

}
