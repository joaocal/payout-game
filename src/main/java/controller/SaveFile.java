/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author joaoc
 */
public class SaveFile {
    
    private ArrayList<Object> data;
    
    public SaveFile(ArrayList<Object> data) {
        this.data = data;
    }
    
    public Object loadFile(String pathName) throws FileNotFoundException, IOException, ClassNotFoundException {
        if (!new File(pathName).exists()) {
            new File(pathName).createNewFile();
        }
        
        FileInputStream file = new FileInputStream(pathName);
        
        try (ObjectInputStream obj = new ObjectInputStream(file)) {
            this.data = (ArrayList<Object>)obj.readObject();
            obj.close();
        }
        
        return this.data;
    }
    
    public void saveFile(String pathName) throws FileNotFoundException, IOException, ClassNotFoundException {
        if (!new File(pathName).exists()) {
            new File(pathName).createNewFile();
        }
        
        FileOutputStream file = new FileOutputStream(pathName);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        
        obj.writeObject(this.data);
        obj.flush();
        obj.close();
    }
    
}
