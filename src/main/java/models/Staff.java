package models;

import enums.Gender;
import enums.Position;

public class Staff {
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private double salary;
    private Position position;
    private String staffID;
    private String qualification;


    public Staff( String staffID,  String name, int age, Gender gender, String address, String qualification, double salary, Position position){
        this.staffID = staffID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.qualification= qualification;
        this.salary = salary;
        this.position= position;

    }
    public Staff(String name, Gender gender, String address){
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public Staff(){

    }
    public  String getStaffID() { return staffID;}
    public String getName(){
        return name;
    }

    public Gender getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
    public  String getQualification() {return  qualification;}
    public Position getPosition(){
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(Gender gender) {
        this.gender=gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
}
