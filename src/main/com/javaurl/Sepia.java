package main.com.javaurl;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class Sepia
{
    public static void main(String args[])throws IOException
    {
        BufferedImage img = null;
        File f = null;
        try
        {
            f = new File("G:\\Inp.jpg");
            img = ImageIO.read(f);
        }
        catch(IOException e)
       {
            System.out.println(e);
        }
        int width = img.getWidth();
        int height = img.getHeight();
        //convert to sepia
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                int p = img.getRGB(x,y);
               int a = (p>>24)&0xff;
                int R = (p>>16)&0xff;
                int G = (p>>8)&0xff;
                int B = p&0xff;
                int newRed = (int)(0.393*R + 0.769*G + 0.189*B);
                int newGreen = (int)(0.349*R + 0.686*G + 0.168*B);
                int newBlue = (int)(0.272*R + 0.534*G + 0.131*B);
                if (newRed > 255)
                    R = 255;
                else
                    R = newRed;
                if (newGreen > 255)
                    G = 255;
                else
                    G = newGreen;
                if (newBlue > 255)
                    B = 255;
               else
                   B = newBlue;
               p = (a<<24) | (R<<16) | (G<<8) | B;
                img.setRGB(x, y, p);
            }
        }
        try
        {
            f = new File("G:\\Out.jpg");
            ImageIO.write(img, "jpg", f);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}