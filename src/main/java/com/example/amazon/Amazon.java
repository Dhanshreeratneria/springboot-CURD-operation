package com.example.amazon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Amazon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
    private String name;
    private  String proname;
    private int cost;
    public Amazon(int customerid, String name, String proname, int cost) {
        this.customerid = customerid;
        this.name = name;
        this.proname = proname;
        this.cost = cost;
    }
    public Amazon() {
        //TODO Auto-generated constructor stub
    }
    public int getCustomerid() {
        return customerid;
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProname() {
        return proname;
    }
    public void setProname(String proname) {
        this.proname = proname;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Amazon [customerid=" + customerid + ", name=" + name + ", proname=" + proname + ", cost=" + cost + "]";
    }

    
    



}
