import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class Server1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Tweb T ;
		ServerSocket listn=new ServerSocket(2323);
		
		
			System.out.println("Waiting for a clinet .......");
		while(true) {
			Socket web=listn.accept();
		 System.out.println("New client ");
		 T=new Tweb(web);
		 T.start();
		
		}
		
		

	}

}
