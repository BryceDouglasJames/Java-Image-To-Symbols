package Frame;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

public class FileChooser extends JFrame{
	
	private JFileChooser explore;
	private String URL;
	private File photo = null;
	
	public FileChooser() throws Exception
	{
		explore = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int exists = explore.showOpenDialog(null);
		
		if(exists == JFileChooser.APPROVE_OPTION)
		{
			grabFile();
		}
		
		setLayout(new BorderLayout());
		add(explore, BorderLayout.NORTH);
	
	}
	
	private void grabFile() throws Exception
	{
		try {
			photo = explore.getSelectedFile();
			URL = (String)photo.getAbsolutePath();
		}catch(Exception e)
		{
			System.out.println("Cannot Find File!");
			System.exit(ERROR);
		}
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	
}
