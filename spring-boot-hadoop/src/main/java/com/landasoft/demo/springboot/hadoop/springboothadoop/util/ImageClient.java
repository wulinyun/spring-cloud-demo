package com.landasoft.demo.springboot.hadoop.springboothadoop.util;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ImageClient extends JFrame { 
 
	public ImageClient(byte[] bytes, String path) throws Exception {
		 int width = 100; 
		 int height = 100; 
		  
		 ImageIcon image = new ImageIcon(bytes,path);
		 image.setImage(image.getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT)); 
		 JLabel label = new JLabel(image); 
		  
		 getContentPane().add(label); 
		  
		 setBounds(100, 100, 200, 200); 
		 setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 setVisible(true); 
	} 
 
}