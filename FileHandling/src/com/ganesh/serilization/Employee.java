package com.ganesh.serilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.List;

public class Employee implements Externalizable {
    private static String department;
    private int id;
    private String name;
    private String address;
    private transient String category;
    private List<String> listOfTask;
    private Integer[] scores;

    public Integer[] getScores() {
        return scores;
    }

    public void setScores(Integer[] scores) {
        this.scores = scores;
    }

    public List<String> getListOfTask() {
        return listOfTask;
    }

    public void setListOfTask(List<String> listOfTask) {
        this.listOfTask = listOfTask;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        Employee.department = department;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", department='" + department + '\'' +
                ", listOfTask='" + listOfTask + '\'' +
                ", scores='" + (scores == null ? null : (Arrays.asList(scores))) + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(address);
        out.writeObject(category);
        out.writeObject(listOfTask);
        out.writeInt(id);
        out.writeObject(scores);
        System.out.println("writeExternal is called!!");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        address= (String) in.readObject();
        category= (String) in.readObject();
        listOfTask= (List<String>) in.readObject();
        id = in.readInt();
        scores = (Integer[]) in.readObject();
        System.out.println("readExternal is called");
    }
}