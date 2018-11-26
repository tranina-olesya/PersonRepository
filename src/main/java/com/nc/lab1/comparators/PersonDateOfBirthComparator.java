package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;

public class PersonDateOfBirthComparator implements PersonComparator {

    public int compare(Person p1, Person p2) {
        //int a= p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
        return -p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
    }
}
