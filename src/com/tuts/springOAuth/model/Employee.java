package com.tuts.springOAuth.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private static final long serialVersionUID = -7788619177798333712L;

    private int id;
    private String name;
    private Date createdDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
