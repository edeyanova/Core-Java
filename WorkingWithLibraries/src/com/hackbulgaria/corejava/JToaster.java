package com.hackbulgaria.corejava;
import java.awt.Color;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;


import com.nitido.utils.toaster.Toaster;


public class JToaster {
    
    public static void main(String args[]) throws InterruptedException, IOException {
        File file = new File("C:\\Users\\Elina\\Desktop\\dog.jpg");
        Toaster toast = new Toaster();
        toast.setToasterWidth(1500);
        toast.setToasterHeight(800);
        //toast.setToasterIcon();
        toast.setToasterColor(new Color(20));
        toast.setBackgroundImage(ImageIO.read(file));
        toast.setStep(10);
        Thread.sleep(1000);
        toast.showToaster("Get a little rest, will you?");
    }


}
