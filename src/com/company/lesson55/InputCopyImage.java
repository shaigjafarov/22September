package com.company.lesson55;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputCopyImage {



    public static void main(String[] args) {
        String sourceFilePath = "sample.png";
        String destFilePath = "sample3.png";

        try (InputStream inputStream = new FileInputStream(sourceFilePath);
             OutputStream outputStream = new FileOutputStream(destFilePath)) {

            // Input stream'den okunan byte'lar output stream'e yazılır.
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("Dosya başarıyla kopyalandı");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
