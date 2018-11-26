package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;

public interface PersonChecker {

    /**
     * Check if person match value
     * @param p person to check
     * @param value value for checking
     * @return
     */
    public boolean check(Person p, Object value);
}
