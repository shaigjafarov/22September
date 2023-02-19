package com.company.lesson55;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class inputStar {
    public static void main(String[] args) {
        File file= new File("nese234.txt");
        try (var fis = new FileInputStream(file); // Unnecessary
             var bis = new BufferedInputStream(fis);
             var ois = new ObjectInputStream(bis);
//             var fis1 = new FileOutputStream("zo-banner.png"); // Unnecessary
//             var bis1 = new BufferedOutputStream(fis1);
//             var ois1 = new ObjectOutputStream(bis1)
        ) {

//            fis.readAllBytes()
            System.out.println(ois.available());
//           byte[] sv= ois.readAllBytes();

//            ois1.writeObject(sv);
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
