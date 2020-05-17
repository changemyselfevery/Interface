package com.zj.creature;

import com.zj.transport.Airtransport;
import com.zj.transport.Landtransport;
import com.zj.transport.Seatransport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/17 11:22
 * @version:
 * @modified By:
 */
public class Person {
    private String id;
    private String name;
    //重载
    public void driveMethod(Airtransport airtransport){
        airtransport.driveMethod();
    }
    public void driveMethod(Landtransport landtransport){
        landtransport.driveMethod();
    }
    public void driveMethod(Seatransport seatransport){
        seatransport.driveMethod();
    }

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
