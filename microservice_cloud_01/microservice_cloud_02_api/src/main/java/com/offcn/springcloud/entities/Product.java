package com.offcn.springcloud.entities;

import java.io.Serializable;

public class Product implements Serializable {//跨服调用必须序列化
    private Long pid;
    private String productName;
    private String dbSource;

    public Product(String productName) {
        this.productName = productName;

    }

    public Product() {
    }

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Long getpid() {
        return pid;
    }

    public void setpid(Long pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
