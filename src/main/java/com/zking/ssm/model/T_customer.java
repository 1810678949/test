package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
public class T_customer implements Serializable{
    private Integer customerId;

    private String customerName;
    private List<T_order>orders=new ArrayList<T_order>();

    public List<T_order> getOrders() {
        return orders;
    }

    public void setOrders(List<T_order> orders) {
        this.orders = orders;
    }

    public T_customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public T_customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}