package wordProcesserJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordProcesser 
{
	static JTextArea mainTextArea = new JTextArea(40, 40);
	
	public static void main(String[] args)
	{
		new WordProcesser();
	}
	
	public WordProcesser()
	{
		//init main gui
		JFrame mainGUI = new JFrame();
		GridBagConstraints grid = new GridBagConstraints();
		mainGUI.getContentPane().setLayout(new GridBagLayout());
		mainGUI.setResizable(true);
		mainGUI.setSize(500, 500);
		
		//textfields
		mainTextArea.setLineWrap(true);
		grid.gridx = 0;
		grid.gridy = 0;
		mainGUI.add(mainTextArea, grid);
		
		
		//exit javaw.exe on close
		mainGUI.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		mainGUI.pack();
		mainGUI.setVisible(true);
	}
}
