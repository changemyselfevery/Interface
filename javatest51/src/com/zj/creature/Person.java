package com.zj.creature;

import com.zj.transport.*;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/16 23:27
 * @version:
 * @modified By:
 */
public class Person {
    private String name;
    private String id;
    //方法重载
    public void driveTransport(Aircraft aircraft){
        aircraft.driveMethod();
    }
    public void driveTransport(Airship airship){
        airship.driveMethod();
    }
    public void driveTransport(Balloon balloon){
        balloon.driveMethod();
    }
    public void driveTransport(Bike bike){
        bike.driveMethod();
    }
    public void driveTransport(Car car){
        car.driveMethod();
    }
    public void driveTransport(Hovercraft hovercraft){
        hovercraft.driveMethod();
    }
    public void driveTransport(Motorcycle motorcycle){
        motorcycle.driveMethod();
    }
    public void driveTransport(Steamer steamer){
        steamer.driveMethod();
    }
    public void driveTransport(Submarine submarine){
        submarine.driveMethod();
    }

    public Person() {
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
