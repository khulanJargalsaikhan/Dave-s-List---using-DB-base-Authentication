package com.example.daveslist;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class List {
    @NotEmpty
    @NotNull
    private String address;

    @NotEmpty
    @NotNull
    private String city;

    @NotEmpty
    @NotNull
    private String state;

    @NotNull
    private double price;

    @NotEmpty
    @NotNull
    private String description;

    @NotEmpty
    @NotNull
    private String rules;


    @NotNull
    private boolean wifi;

    @NotEmpty
    @NotNull
    private String cable;


    @NotNull
    private boolean privateBathroom;


    @NotNull
    private boolean rented;

    private long id;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public boolean isPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(boolean privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
