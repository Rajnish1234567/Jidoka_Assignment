package com.multithreading;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class Multithreading implements Runnable{
	
    public static void main(String[] args) throws IOException {
    	
        URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiwIvLPTewaYjdyVfnex9VHwNNT8XM_oRQyoBrOK03&s");
        InputStream is = url.openStream();
        BufferedImage img= (BufferedImage) ImageIO.read(is);

        int rows = 3;
        int cols = 3;
        BufferedImage imgs[] = new BufferedImage[rows*cols];

        int subimg_Width = img.getWidth()/cols;
        int subimg_Height = img.getHeight()/rows; 
        int cur_img = 0;
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                imgs[cur_img] = new BufferedImage(subimg_Width, subimg_Height, img.getType());
                Graphics2D img_creator = imgs[cur_img].createGraphics();

                int src_x = subimg_Width * j;
                int src_y = subimg_Height * i;

                int dst_x = subimg_Width * j + subimg_Width;
                int dst_y = subimg_Height * i + subimg_Height;
                
                img_creator.drawImage(img, 0, 0, subimg_Width, subimg_Height, src_x, src_y, dst_x, dst_y, null);
                cur_img++;
            }
        }
        File file=new File("abc");
        if(!file.exists()) {
        	file.mkdir();
        	System.out.println("Created directory");
        }
        else {
        	System.out.println("File already exists");
        }

        for (int i = 0; i <imgs.length; i++)
        {
			try {
				File output = new File("abc/img" + i + ".jpg");
				ImageIO.write(imgs[i], "jpg", output);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        System.out.println("Sub-images have been created.");
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	
}
