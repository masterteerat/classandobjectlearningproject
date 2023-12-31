package com.example.classmanagementv2;

public class DataProductLine {
    public String prodId;
    public int imgResId;
    public String description;
    public Integer quantity;
    public Double price;
    public Double totalPrice;
    public String status;
    public String recId;
    public String name;

    public DataProductLine(String prodId, int imgResId, String description, Integer quantity, Double price, Double totalPrice, String status) {
        this.prodId = prodId;
        this.imgResId = imgResId;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.status = status;
        this.recId = "";
        this.name = "";
    }

    private void SetDataProductLine(String prodId, int imgResId, String description, Integer quantity, Double price, Double totalPrice, String status) {
        this.prodId = prodId;
        this.imgResId = imgResId;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.status = status;
        this.recId = "";
        this.name = "";
    }
}
