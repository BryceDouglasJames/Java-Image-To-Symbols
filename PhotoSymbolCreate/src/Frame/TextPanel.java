package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	private JTextArea textArea;
	
	public TextPanel()
	{
		textArea = new JTextArea();
		
		Font font = new Font("Courier New", Font.PLAIN, 3);
		
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}
	
	public void appendText(String text)
	{
		textArea.append(text);
	}
}
