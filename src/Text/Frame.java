
package Text;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;

public class Frame extends JFrame implements ActionListener,MouseListener{
	
	
private JMenuBar menubar;
private JMenu file_open,file_edit,file_help;
private JMenuItem item0,item1,item2,item3,item4,item5,item6,item7,item8,item9;
private Panel panel;
private Notepad pad;
private JPopupMenu popup;
private JMenuItem popupItem;
private JTextField textfield;




 Frame() throws IOException {
	 pad = new Notepad();
	panel = new Panel();
	add(panel);
	pack();
	createFrame();
    createMenu();

	}
	
 
 
 
 
 
 
 
public void createFrame(){
		setName("Editor");
		setSize(new Dimension(600,400));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}



public void createMenu(){
	
	//createing menubar
	 menubar = new JMenuBar();
	 
	 //JMenu creation
	 file_open = new JMenu("File");
	 file_open.setMnemonic(KeyEvent.VK_M);
	 
	 //Jmenu edit
	 
	 file_edit = new JMenu("Edit");
	 
	 //Jmenu help
	 file_help = new JMenu("Help");
	 
	 

	//crete popup
	 popup = new JPopupMenu();
	 
	 //
	 textfield = new JTextField();
	
	 //Jmenu items
	 item0 = new JMenuItem("New");
	 item0.addActionListener(this);
	item1 = new JMenuItem("Open");
	item1.addActionListener(this);
	item1.setActionCommand("open");
	item1.setToolTipText("Open new File");
	item2 = new JMenuItem("Save");
	
	
	item3 = new JMenuItem("Save As");
	item3.addActionListener(this);
	item4 = new JMenuItem("Exit");
	item4.addActionListener(this);
	item5 = new JMenuItem("About");
	item5.addMouseListener(this);
	
	
	item6 = new JMenuItem("Copy");
	
	item6.addActionListener(this);
	item7 = new JMenuItem();
	item7.setText("Paste");
	
	item7.addActionListener(this);
	item8 = new JMenuItem("Find");
	item8.addActionListener(this);
	item9 = new JMenuItem("Clear");
	item9.addMouseListener(this);
	
item4.setToolTipText("Exiting application");
	popupItem = new JMenuItem("Version:1.0.0 \n"
			+ "Author:Marko Miljkovic");

	 file_open.add(item0);
	file_open.add(item1);
	file_open.add(item2);
	file_open.add(item3);
	file_open.add(item4);
	file_help.add(item5);
	file_edit.add(item6);
	file_edit.add(item7);
	file_edit.add(item8);
	file_edit.add(item9);
	
		menubar.add(file_open);
		menubar.add(file_edit);
		menubar.add(Box.createHorizontalGlue());
		menubar.add(file_help);
		setJMenuBar(menubar);
		
	
}








@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==item8){
		String s = panel.getTextArea();
		
		String word = JOptionPane.showInputDialog(null, "Type a word!!!");
		boolean val =pad.checkCharacters(s, word);
		if(val == true){
			int [] arr = pad.findCharacters(s, word);
			try {
				panel.highlighText(arr);
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else{
			JOptionPane.showMessageDialog(null, "No such word", "Sorry", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
	}
	else if(e.getSource()==item7){
	String s = pad.getClipboardContents();
	panel.settextonTextfield(s);
		
	}

//exiting program
else if(e.getSource()==item4){
		System.exit(0);
}
//coping text
else if(e.getSource()==item6){
		String text = panel.getSelectedAreaText();
		pad.copyText(text);
	
		System.out.println(text);
	}
//oppening new 
else if(e.getSource()==item0){
		int b = JOptionPane.showConfirmDialog(null, "Do you want to save your file");
		if(b==0){
			JFileChooser choser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
			choser.setFileFilter(filter);
			int saver = choser.showSaveDialog(null);
			if(saver == choser.APPROVE_OPTION){
				String content = panel.getTextArea();
				String file = choser.getSelectedFile().getAbsolutePath();
				try {
					pad.saveFile(file, content);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
}else if(b==1){
		panel.clearArea();
}}}

//open file
else if(e.getSource()==item1){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Only text files", "txt");
		chooser.setFileFilter(filter);
		int response = chooser.showOpenDialog(null);
		if(response == chooser.APPROVE_OPTION){
			String file = chooser.getSelectedFile().toString();
			try {
				String s = pad.openfile(file);
				panel.settextonTextfield(s);
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else{
			JOptionPane.showMessageDialog(null, "Something goes wrong try again", "Error message", JOptionPane.ERROR_MESSAGE, null);
		}}
///saving file
	else if(e.getSource()==item3){
		JFileChooser choser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
		choser.setFileFilter(filter);
		int saver = choser.showSaveDialog(null);
		if(saver == choser.APPROVE_OPTION){
			String content = panel.getTextArea();
			String file = choser.getSelectedFile().getAbsolutePath();
			try {
				pad.saveFile(file, content);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
	}
}

	
	
	
		
		
	





		
	
	
	
	











/////MOUSe Listeners

@Override
public void mousePressed(MouseEvent e) {
	if(e.getSource()==item5){
		popup.add(popupItem);
		popup.show(e.getComponent(), e.getX()-50, e.getY());
	}else if(e.getSource()==item9){
		panel.clearArea();
	}
	
	
}








@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}








@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}








@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}








@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}










	
	
}
