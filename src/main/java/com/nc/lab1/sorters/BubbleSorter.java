package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;

public class BubbleSorter implements PersonSorter {

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
        return people;
    }
}

