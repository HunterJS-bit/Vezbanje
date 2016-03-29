package game;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.ObjectInputStream.GetField;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Weblog{

	
	
	
	/*public static void main(String[] args) throws UnknownHostException {

		
		getHostName("C:\\Users\\Marko\\Desktop\\marko.txt");
		
				}
	*/
	
	
	
	
	
	public static void getHostName(String file){
		String addresa;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			
 
			String sCurrentLine;
			StringBuilder builder = new StringBuilder();
 
			while ((sCurrentLine = br.readLine()) != null) {
				builder.append(sCurrentLine);
			}
			System.out.println(builder);
			int empty = builder.indexOf(" ");
			String m = builder.substring(0, 11);
			System.out.println(m);
			
			InetAddress addres = InetAddress.getByName(m);
			addresa = addres.getHostName();
			System.out.println(addresa);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 
	}
	
	
	
	
	
				}
	


