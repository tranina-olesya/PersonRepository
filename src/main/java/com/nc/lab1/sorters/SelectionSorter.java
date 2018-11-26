package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;

public class SelectionSorter implements PersonSorter {

    public Person[] sort(Person[] people, PersonComparator comparator) {

        for (int min = 0; min < people.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < people.length; j++) {
                if (comparator.compare(people[j], people[least]) < 0) {
                    least = j;
                }
            }
            Person tmp = people[min];
            people[min] = people[least];
            people[least] = tmp;
        }
        return people;
    }
}
