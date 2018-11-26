package com.nc.lab1.main;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class Person extends Object {
    public enum Sex
    {
        Male,
        Female
    }
    private String fullName;
    private DateTime dateOfBirth;
    private Sex sex;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return new Period(dateOfBirth, DateTime.now()).getYears();
    }

    public Person(String fullName, DateTime dateOfBirth, Sex sex){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    @Override
    public String toString()
    {
        return "name: " + fullName + ", age: " + getAge();
    }
}