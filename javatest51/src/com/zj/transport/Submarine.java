package com.zj.transport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/16 23:58
 * @version:
 * @modified By:
 */
public class Submarine {
    private String id;
    private String description;

    public Submarine() {
    }

    public Submarine(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void driveMethod(){
        System.out.println("submarine driving");
    }
}
