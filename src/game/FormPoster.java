package game;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;

public class FormPoster {
	public static void main(String[] args) throws MalformedURLException {
		
		
		URL url = new URL("http://www.cafeaulait.org/books/jnp4/postquery.phtml");
		if(url.getProtocol().startsWith("http")){
			System.out.println("OK");
			try {
				InputStream input = sendData(url);
				BufferedInputStream buff = new BufferedInputStream(input);
				Reader r = new InputStreamReader(buff);
				int c;
				while((c=r.read())!=-1){
					System.out.write(c);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else{
			System.out.println("wrong url");
		}
		

		
		
	}
	
	
	
	
	
	public static InputStream sendData(URL url) throws Exception{
		URLConnection connect = url.openConnection();
		String name = "name marko";
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
	 
String m = URLEncoder.encode(name, "UTF-8");
	  
		//hashMap.put(name, value);
		connect.setDoOutput(true);
	try(OutputStreamWriter write = new OutputStreamWriter((connect.getOutputStream()))){
		write.write(m);
		
		write.flush();
		write.close();
	}

	
	return connect.getInputStream();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	


		}

	

			
	




