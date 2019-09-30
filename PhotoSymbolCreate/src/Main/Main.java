package Main;

import Frame.FrameFace;
import javax.swing.*;

public class Main {
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new FrameFace();
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
				
		});
		
		
	}
}
