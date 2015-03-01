package wordProcesserJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordProcesser 
{

	public static void main(String[] args)
	{
		new WordProcesser();
	}
	
	public WordProcesser()
	{
		//init main gui
		JFrame mainGUI = new JFrame();
		
		mainGUI.getContentPane().setLayout(new GridBagLayout());
		mainGUI.setTitle("JavaPad");
		mainGUI.setResizable(true);
		mainGUI.setSize(800, 600);
		
		//init gui objects
		mainGUITextFields(mainGUI);
		mainGUIMenuBar(mainGUI);
		
		
		//exit javaw.exe on close
		mainGUI.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
//		mainGUI.pack();
		mainGUI.setVisible(true);
	}
	
	public void mainGUITextFields(JFrame mainGUI)
	{
		GridBagConstraints grid = new GridBagConstraints();
		
		JTextArea mainTextArea = new JTextArea(0, 0);
		JScrollPane textAreaPane = new JScrollPane(mainTextArea);
		mainTextArea.setLineWrap(true);
		grid.gridx = 0;
		grid.gridy = 0;
		grid.weightx = 2;
		grid.weighty = 1;
		grid.fill = GridBagConstraints.BOTH;
		grid.insets = new Insets(10, 0, 0, 0);
		mainGUI.add(textAreaPane, grid);
	}
	

	public void mainGUIMenuBar(JFrame mainGUI)
	{
		JMenuBar mainMenuBar = new JMenuBar();
	}
	
}
