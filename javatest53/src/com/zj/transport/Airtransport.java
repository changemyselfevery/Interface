package com.zj.transport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/17 10:39
 * @version:
 * @modified By:
 */
public abstract class Airtransport {
    private String id;
    private String description;

    public abstract void driveMethod();

    public Airtransport(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Airtransport() {
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
}
