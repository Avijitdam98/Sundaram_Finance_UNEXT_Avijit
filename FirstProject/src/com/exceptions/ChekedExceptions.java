package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChekedExceptions{

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Jouney_ppt\\AVijit_Dam_Journey_Book_week2.pdf");
        System.out.println("File opened successfully!");
        fis.close(); 
    }
}
