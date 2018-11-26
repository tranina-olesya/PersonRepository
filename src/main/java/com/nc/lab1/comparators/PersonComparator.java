package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;

public interface PersonComparator {

    /**
     * Compare two people
     * @param p1 first
     * @param p2 second
     * @return > 1 if p1 > p2
     *         < -1 if p1 < p2
     *         0 if p1 == p2
     */
    public int compare(Person p1, Person p2);
}
