package com.hackbulgaria.corejava;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class JavaDownloadFile {

    public static void main(String[] args) {
        try {
            JavaDownloadFile downloader = new JavaDownloadFile();
            
            downloader.download(" http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg", "C:\\tmp");
        
        } catch (IOException e) {
           
        	e.printStackTrace();
        }
    }

    private void download(String fileURL, String destinationDirectory) throws IOException {

        String downloadedFileName = fileURL.substring(fileURL.lastIndexOf("/")+1);

        URL url = new URL(fileURL);

        InputStream is = url.openStream();

        FileOutputStream fos = new FileOutputStream(destinationDirectory + "/" + downloadedFileName);


        byte[] buffer = new byte[4096];

        int bytesRead = 0;

         

        System.out.print("Downloading " + downloadedFileName);

        while ((bytesRead = is.read(buffer)) != -1) {

            System.out.print("."); 
            fos.write(buffer,0,bytesRead);

        }

        System.out.println("done!");

        fos.close();

        is.close();

    }   

}

