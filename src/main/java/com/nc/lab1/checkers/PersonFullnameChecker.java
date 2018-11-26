package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;

public class PersonFullnameChecker implements PersonChecker {

    public boolean check(Person p, Object value)
    {
        return p.getFullName().contains((String)value);
    }
}
