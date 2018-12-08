package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;
import org.apache.log4j.Logger;

public class InsertionSorter implements PersonSorter {

    private static final Logger logger = Logger.getLogger(InsertionSorter.class);

    public Person[] sort(Person[] people, PersonComparator comparator)
    {
        Person temp;
        int j;
        for(int i = 0; i < people.length - 1; i++){
            if (comparator.compare(people[i], people[i+1]) > 0) {
                temp = people[i + 1];
                people[i + 1] = people[i];
                j = i;
                while (j > 0 && comparator.compare(temp, people[j-1]) < 0) {
                    people[j] = people[j - 1];
                    j--;
                }
                people[j] = temp;
            }
        }
        logger.info(String.format("List of people sorted with (%s) and (%s)", InsertionSorter.class.getName(), comparator.getClass().getName()));
        return people;
    }
}
