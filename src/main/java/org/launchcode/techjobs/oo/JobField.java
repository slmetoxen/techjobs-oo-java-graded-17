package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

//  //  public void setId(int id) {
//        this.id = id;
//    }

//    public static int getNextId() {
//        return nextId;
//    }

//    public static void setNextId(int nextId) {
//        JobField.nextId = nextId;
//    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
