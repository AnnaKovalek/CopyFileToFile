package main;

import java.io.*;

/**
 *
 */
public class CopyFileToFile {
    //  public static final String IN = "/home/anna/File";

    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        File from = new File("/home/anna/Pictures/IMG_3261666.jpg");
        File to = new File("/home/anna/Documents/IMG_3261666.jpg");
        if (to.exists()) {
            System.out.println("Файл уже существует");
        } else {
            try {
                inStream = new FileInputStream(from);
                outStream = new FileOutputStream(to);
                int i;
                while ((i = inStream.read()) != -1) {
                    outStream.write(i);

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (inStream != null) {
                    inStream.close();
                    if (outStream != null) {
                        outStream.close();
                    }
                }
            }


        }



    }


}
