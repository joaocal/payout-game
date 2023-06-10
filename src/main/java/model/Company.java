/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.SaveFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author joaoc
 */
public class Company {
    private double money;               // 00
    private String name;                // 01
    private int employees;              // 02
    private double value;               // 03
    private double revenue;             // 04
    private double loss;                // 05
    private final String PATHNAME = "save.dat";
    private ArrayList<Object> data;
    
    public Company(double money, String name, int employees, double value, double revenue, double loss) {
        this.money = money;
        this.name = name;
        this.employees = employees;
        this.value = value;
        this.revenue = revenue;
        this.loss = loss;
        
        this.data = new ArrayList<>(6);
        this.data.add(money);
        this.data.add(name);
        this.data.add(employees);
        this.data.add(value);
        this.data.add(revenue);
        this.data.add(loss);
    }
    
    public Company() {
        try {
            loadCompany();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getMoney() {
        return money;
    }
    
    public String getName() {
        return name;
    }
    
    public int getEmployees() {
        return employees;
    }
    
    public double getValue() {
        return value;
    }
    
    public double getRevenue() {
        return revenue;
    }
    
    public double getLoss() {
        return loss;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmployees(int employees) {
        this.employees = employees;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
    
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    
    public void setLoss(double loss) {
        this.loss = loss;
    }
    
    public void addMoney(double money) {
        this.money += money;
    }
    
    public void addEmployees(int employees) {
        this.employees += employees;
    }
    
    public void addValue(double value) {
        this.value += value;
    }
    
    public void addRevenue(double revenue) {
        this.revenue += revenue;
    }
    
    public void addLoss(double loss) {
        this.loss += loss;
    }
    
    public void removeMoney(double money) {
        this.money -= money;
    }
    
    public void removeEmployees(int employees) {
        this.employees -= employees;
    }
    
    public void removeValue(double value) {
        this.value -= value;
    }
    
    public void removeRevenue(double revenue) {
        this.revenue -= revenue;
    }
    
    public void removeLoss(double loss) {
        this.loss -= loss;
    }
    
    public void saveCompany() throws IOException, FileNotFoundException, ClassNotFoundException {
        SaveFile saveFile = new SaveFile(data);
        saveFile.saveFile(PATHNAME);
    }
    
    private void loadCompany() throws IOException, FileNotFoundException, ClassNotFoundException {
        SaveFile saveFile = new SaveFile(data);
        saveFile.loadFile(PATHNAME);
        
        setMoney((double) data.get(0));
        setName((String) data.get(1));
        setEmployees((int) data.get(2));
        setValue((double) data.get(3));
        setRevenue((double) data.get(4));
        setLoss((double) data.get(5));
    }
    
}
