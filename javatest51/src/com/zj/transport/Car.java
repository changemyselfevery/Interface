package com.zj.transport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/16 23:41
 * @version:
 * @modified By:
 */
public class Car {
    private String id;
    private System description;

    public Car() {
    }

    public Car(String id, System description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public System getDescription() {
        return description;
    }

    public void setDescription(System description) {
        this.description = description;
    }

    public void driveMethod(){
        System.out.println("Car driving");
    }
}
