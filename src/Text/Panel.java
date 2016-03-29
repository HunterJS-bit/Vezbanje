package Text;

import java.awt.Color;
import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

public class Panel extends JPanel  {

	
	private JTextArea area;
	private JPanel panel;
	
	private Notepad notepad;
	
	Panel(){
	panel = new JPanel();
area = new JTextArea(50,50);

panel.add(area);

this.add(panel);

	}
	
	
	public void settextonTextfield(String name){
		
		
		area.setText(name);
	}
	
	
	public String getTextArea(){
		return area.getText();
	}


	public void clearArea(){
		area.setText(null);
	}
	
	
	public String getSelectedAreaText(){
		String s = area.getSelectedText();
		
		return s;
	}
	
   
	

	public void highlighText(int [] arr) throws BadLocationException{
		
		String s = getTextArea();
		
	 

	    

	      Highlighter highlighter = area.getHighlighter();
	      HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.PINK);
	      int p0 = arr[0];
	      int p1 = arr[1];
	      
	      highlighter.addHighlight(p0, p1, painter);
	      
	      JOptionPane.showMessageDialog(null, new JScrollPane(area)); 
	}
	
	
	
	
}
