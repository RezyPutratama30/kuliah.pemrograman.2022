package org.Latform.gui;

public class FormCreateFile {
    try {
        FormCreateFile myWriter = new FormCreateFile("filename.txt");
        myWriter.LatForm("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
