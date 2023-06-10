/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Company;

/**
 *
 * @author joaoc
 */
public class Player {
    
    private double money;
    private String name;
    private Company company;
    
    public Player(double money, String name, Company company) {
        this.money = money;
        this.name = name;
        this.company = company;
    }
    
    public Player(double money, String name) {
        this.money = money;
        this.name = name;
    }
    
    public Player(double money) {
        this.money = money;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
    
    public void addMoney(double money) {
        this.money += money;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Company getCompany() {
        return company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
}
