package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;
@ToString
public class T_order implements Serializable{
    private Integer orderId;

    private String orderNo;

    private Integer cid;
    private  T_customer t_customer;

    public T_customer getT_customer() {
        return t_customer;
    }

    public void setT_customer(T_customer t_customer) {
        this.t_customer = t_customer;
    }

    public T_order(Integer orderId, String orderNo, Integer cid) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.cid = cid;
    }

    public T_order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}