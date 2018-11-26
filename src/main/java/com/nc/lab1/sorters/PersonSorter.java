package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;

public interface PersonSorter {
    /**
     * Sorts array of people using comparator
     * @param people
     * @param comparator
     * @return sorted array
     */
    public Person[] sort(Person[] people, PersonComparator comparator);
}
