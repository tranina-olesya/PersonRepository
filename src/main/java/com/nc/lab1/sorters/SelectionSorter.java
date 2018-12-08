package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;
import org.apache.log4j.Logger;

public class SelectionSorter implements PersonSorter {

    private static final Logger logger = Logger.getLogger(SelectionSorter.class);

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
        logger.info(String.format("List of people sorted with (%s) and (%s)", SelectionSorter.class.getName(), comparator.getClass().getName()));
        return people;
    }
}
