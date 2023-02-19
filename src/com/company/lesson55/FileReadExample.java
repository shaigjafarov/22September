package com.company.lesson55;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileReadExample {

    public static void main(String[] args) throws URISyntaxException, IOException {
//        URI uri =new URI("http://www.example.com/index.html");
//        URI uri = new URI("http", "www.example.com", "/index.html", null);

        File file= new File("/Users/005035_mac/Downloads/22September/src/com/company/lesson55/nese.txt");
//        file = new File(new URI("file:///Users/pankaj/test.txt"));

        try (FileReader reader = new FileReader(file)) { // FileReader nesnesi oluşturun
            int character;
            while ((character = reader.read()) != -1) { // Karakterleri okuyun ve konsola yazdırın
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


        File sdd=new File("file213.txt");

        FileWriter fileWriter= new FileWriter(sdd);
        fileWriter.write("jkknkn");
        fileWriter.append("salam");
        fileWriter.write("Dfgfg");
        fileWriter.append("salam");
        fileWriter.append("salam");
        fileWriter.close();

//        sdd.canExecute();
        String absolutePath = sdd.getAbsolutePath();
        System.out.println(absolutePath);


    }
}
