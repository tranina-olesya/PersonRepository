package com.nc.lab1.main;

import org.apache.log4j.Logger;
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

    private static final Logger logger = Logger.getLogger(PersonList.class);

    public Person(String fullName, DateTime dateOfBirth, Sex sex){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        logger.info(String.format("Person (%s) was created", this.toString() ));
    }

    @Override
    public String toString()
    {
        return String.format("name: %s; date of birth: %s; sex: %s", fullName, dateOfBirth.toString("dd.MM.yyyy"), sex.toString());
    }
}