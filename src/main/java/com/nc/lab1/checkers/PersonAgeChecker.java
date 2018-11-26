package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;

public class PersonAgeChecker implements PersonChecker {

    public boolean check(Person p, Object value)
    {
        return value.equals(p.getAge());
    }
}
