package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    //common variables
    private int id;
    private static int nextId = 1;
    private String value;

    //common constructors
    public JobField(){
        this.id = id;
        nextId++;
    }
    public JobField(String value){
        this();
        this.value = value;
    }
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //common methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
