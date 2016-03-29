package Exercises;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.util.ArrayList;

public class CorrectTimeFromInternet {
public static void main(String[] args) throws IOException {

	
	/// this code gets current time from internet time servers and prints it out 
	final String SITE = "time-a.nist.gov";
	final int PORT = 13;
	
	
	Socket socket = new Socket(SITE,PORT );
	InputStream in = socket.getInputStream();
	BufferedInputStream buff = new BufferedInputStream(in);
	Reader r = new InputStreamReader(buff);
	
	int c ;
	
	StringBuilder builder = new StringBuilder();
	while((c= r.read()) != -1){
	builder.append((char) c);

	}

	
	String s = builder.substring(15,21);
	System.out.println("Cuurent time is "+ s);
	
	
}

}