package com.example.demoapi.product_api;

public class Product {
private int id;  
private String pname;  
private String batchno;  
private double price;  
private int noofproduct;

//constructor using fields  
public Product(int id, String pname, String batchno, double price, int noofproduct) {
    super();  
    this.id = id;
    this.pname = pname;
    this.batchno = batchno;
    this.price = price;
    this.noofproduct = noofproduct;
}


//default constructor
public Product() {
}


public int getId() {
    return id;
}


public String getPname() {
    return pname;
}


public String getBatchno() {
    return batchno;
}


public double getPrice() {
    return price;
}


public int getNoofproduct() {
    return noofproduct;
}


public void setId(int id) {
    this.id = id;
}


public void setPname(String pname) {
    this.pname = pname;
}


public void setBatchno(String batchno) {
    this.batchno = batchno;
}


public void setPrice(double price) {
    this.price = price;
}


public void setNoofproduct(int noofproduct) {
    this.noofproduct = noofproduct;
} 



}
