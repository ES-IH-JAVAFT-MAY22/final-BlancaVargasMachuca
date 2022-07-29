package com.ironhack.proxyorderservice.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    private int numberOrder;

    private String nameClient;

    private Date dateOrder;

    private Date dateDelivery;

    private int pickupTime;

    private String Address;

    private Long userId;

    public Order() {
    }

    public Order(String nameClient, Date dateOrder, Date dateDelivery, int pickupTime, String address, Long userId) {
        this.nameClient = nameClient;
        this.dateOrder = dateOrder;
        this.dateDelivery = dateDelivery;
        this.pickupTime = pickupTime;
        Address = address;
        this.userId = userId;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
