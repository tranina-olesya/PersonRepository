package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;

public class PersonFullnameComparator implements PersonComparator {

    public int compare(Person p1, Person p2) {
        return p1.getFullName().compareTo(p2.getFullName());
    }
}
