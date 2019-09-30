package Frame;

import java.awt.BorderLayout;

import javax.swing.*;

import Convert.ConvertImage;

public class FrameFace extends JFrame{
	
	private JButton button;
	private JPanel panel;
	private TextPanel textField;
	private FileChooser fileChooser;
	
	
	public FrameFace() throws Exception{
		super("Image to symbols");
		
		button = new JButton("Create Image");
		fileChooser = new FileChooser();
		panel = new JPanel();
		textField = new TextPanel();
		
		
		
		
		
		setLayout(new BorderLayout());
		
		//add(button, BorderLayout.SOUTH);
		add(textField, BorderLayout.CENTER);
		
		ConvertImage.RGBCreate(fileChooser.getURL(), textField);
		
		setSize(ConvertImage.width * 2,ConvertImage.height * 4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
