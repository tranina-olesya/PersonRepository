package com.nc.lab1.sorters;

import com.nc.lab1.comparators.PersonFullnameComparator;
import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;
import org.apache.log4j.Logger;

public class BubbleSorter implements PersonSorter {

    private static final Logger logger = Logger.getLogger(BubbleSorter.class);

    public Person[] sort(Person[] people, PersonComparator comparator)
    {
        for (int i = people.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(comparator.compare(people[j], people[j+1]) > 0)
                {
                    Person c = people[j];
                    people[j] = people[j+1];
                    people[j+1] = c;
                }
            }
        }
        logger.info(String.format("List of people sorted with (%s) and (%s)", BubbleSorter.class.getName(), comparator.getClass().getName()));
        return people;
    }
}

