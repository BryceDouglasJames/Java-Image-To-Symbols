package Convert;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.Arrays;
import java.util.EventListener;
import java.util.Scanner;

import javax.imageio.*;

import Frame.TextPanel;
import Interface.FormListener;


public class ConvertImage{
	
		public static int width;
		public static int height;

		ConvertImage(){}
		
		public static void RGBCreate(String inImage, TextPanel textPanel) throws IOException
		{

			double gValue;
			BufferedImage image = null;

			try {
				
				image = ImageIO.read(new File(inImage));
				//System.out.println("Image Height: " + image.getHeight() +"\nImage Width: " + image.getWidth());
				width = image.getWidth();
				height = image.getHeight();

			}catch(Exception e){e.printStackTrace();}	
			
			for(int i = 0; i < image.getHeight(); i++)
			{
				for(int j = 0; j < image.getWidth(); j++)
				{

					Color pixelColor = new Color(image.getRGB(j, i));
					gValue = (((pixelColor.getRed()*0.29)+(pixelColor.getBlue()*0.59)+(pixelColor.getGreen()*0.11)));
				
					textPanel.appendText(returnSymbol(gValue));
					//System.out.print(returnSymbol(gValue));
					
				}
				textPanel.appendText("\n");
				//System.out.print("\n");
		}
	}
	
	public static String returnSymbol(double g)
	{
		String str;
		/*if(value < 100)
			return".";
		if(value > 100 && value < 200)
			return ",";
		if(value >200)
			return "@";
		else
			return null;
		*/
		if (g >= 230)
	    {
	        str = "@";
	    }
	    else if (g >= 200)
	    {
	        str = "#";
	    }
	    else if (g >= 180)
	    {
	        str = "8";
	    }
	    else if (g>= 160)
	    {
	        str = "&";
	    }
	    else if (g >= 130)
	    {
	        str = "o";
	    }
	    else if (g >= 100)
	    {
	        str = ":";
	    }
	    else if (g >= 70)
	    {
	        str = "*";
	    }
	    else if (g >= 50)
	    {
	        str = ".";
	    }
	    else
	    {
	        str = " ";
	    }
		
		return str;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}