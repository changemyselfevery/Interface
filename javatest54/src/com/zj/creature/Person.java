package com.zj.creature;

import com.zj.transport.Transport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/17 10:35
 * @version:
 * @modified By:
 */
public class Person {
    private String id;
    private String name;
    //向上造型
    public void driveTransport(Transport transport){
        transport.driveMethod();
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
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
