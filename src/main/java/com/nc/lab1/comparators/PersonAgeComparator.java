package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;

public class PersonAgeComparator implements PersonComparator {

    public int compare(Person p1, Person p2)
    {
        return p1.getAge() - p2.getAge();
    }
}
