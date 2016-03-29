package Text;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Notepad {

	
	private Panel panel;
	public Notepad() throws IOException {

	
	}
	
	
	//open file 
public String  openfile(String name) throws IOException{
		  BufferedReader in = new BufferedReader(new FileReader(name));

		StringBuilder builder = new StringBuilder();
		    String str;
		   
		    while ((str = in.readLine()) != null)
		    	
		    	  builder.append(str);
			//builder.append("\n");
		  
		    
		    in.close();
		    String g = builder.toString();
		    return g;
		    
	}
	
	//save file
public void saveFile(String path,String content) throws IOException{
		File file = new File(path);
		if(file.exists()){
			file.createNewFile();
		}
		
		FileWriter writer = new FileWriter(file.getAbsoluteFile());
		BufferedWriter buff = new BufferedWriter(writer);
		buff.write(content);
		buff.close();
		
}
	

//copy file
public void copyText(String s){
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	StringSelection strSel = new StringSelection(s);
	clipboard.setContents(strSel, null);
}

//save file
public void savingFile(){
	JFileChooser choser = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
	choser.setFileFilter(filter);
	int saver = choser.showSaveDialog(null);
	if(saver == choser.APPROVE_OPTION){
		String content = panel.getTextArea();
		String file = choser.getSelectedFile().getAbsolutePath();
		try {
			saveFile(file, content);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}}
	






public boolean checkCharacters(String name,String problem){
	if(name.contains(problem)){
		return true;
	}else {
		return false;
	}
}


public int[] findCharacters(String name,String problem){

	int n = name.indexOf(problem);
	int sum = n + problem.length();
	int[] arr = new int[2];
	arr[0] = n;
	arr[1] = sum;
	return arr;
	

}





public String getClipboardContents() {
	  String result = "";
	  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	  //odd: the Object param of getContents is not currently used
	  Transferable contents = clipboard.getContents(null);
	  boolean hasTransferableText =
	    (contents != null) &&
	    contents.isDataFlavorSupported(DataFlavor.stringFlavor)
	  ;
	  if ( hasTransferableText ) {
	    try {
	      result = (String)contents.getTransferData(DataFlavor.stringFlavor);
	    }
	    catch (UnsupportedFlavorException ex){
	      //highly unlikely since we are using a standard DataFlavor
	      System.out.println(ex);
	      ex.printStackTrace();
	    }
	    catch (IOException ex) {
	      System.out.println(ex);
	      ex.printStackTrace();
	    }
	  }
	  return result;
	}



}
    







  











	
	
	
	
	
	
	
	
	
	
	
	
	














