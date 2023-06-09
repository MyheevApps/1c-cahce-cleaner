/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cachecleaner.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author max
 */
public class Serialization {
    
    public static void saveToFile(List data){
        try {
            FileOutputStream file = new FileOutputStream(new File("data.txt"));
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(data);
            obj.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
    
    public static List getTable() {
        List data = null;

        try {
            FileInputStream file = new FileInputStream(new File("data.txt"));
            ObjectInputStream obj = new ObjectInputStream(file);
            data = (List) obj.readObject();
            obj.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return data != null ? data : null;
    }
    
}
