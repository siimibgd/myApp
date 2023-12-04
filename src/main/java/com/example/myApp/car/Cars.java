package com.example.myApp.car;

import jakarta.persistence.*;

@Entity
@Table
public class Cars {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column
    private String plateNumber;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private String color;
    @Column
    private int year;
    @Column
    private int cc;
    @Column
    private String fuel;
    @Column
    private int power;
    @Column
    private int torque;
    @Column
    private int volume;
    @Column
    private int price;

    /*public Cars(long id, String plateNumber, String brand, String model, String color, int year, int cc, String fuel, int power, int torque, int volume, int price) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.cc = cc;
        this.fuel = fuel;
        this.power = power;
        this.torque = torque;
        this.volume = volume;
        this.price = price;
    }*/

    public Cars() {
    }

    public Cars(String plateNumber, String brand, String model, String color, int year, int cc, String fuel, int power, int torque, int volume, int price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.cc = cc;
        this.fuel = fuel;
        this.power = power;
        this.torque = torque;
        this.volume = volume;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", plateNumber='" + plateNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", cc=" + cc +
                ", fuel='" + fuel + '\'' +
                ", power=" + power +
                ", torque=" + torque +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
