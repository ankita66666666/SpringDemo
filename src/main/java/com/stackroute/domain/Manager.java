package com.stackroute.domain;

public class Manager {
    private int id;
    private String name;
    private surveyor surveyor;

    public Manager() {
    }

    public Manager(int id, String name, com.stackroute.domain.surveyor surveyor) {
        this.id = id;
        this.name = name;
        this.surveyor = surveyor;
    }


    public surveyor getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(surveyor surveyor) {
        this.surveyor = surveyor;
    }

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

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surveyor=" + surveyor +
                '}';
    }
}
