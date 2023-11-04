package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap") // qualifier search name
public class Laptop {
    private int id;
    private String brandName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Laptop [id = " + id + ", brand = " + "brand" + brandName + "]";
    }

    public void compile() {
        System.out.println("Laptop compile");
    }
}
