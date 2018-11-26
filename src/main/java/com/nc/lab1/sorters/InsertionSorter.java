package com.nc.lab1.sorters;

import com.nc.lab1.main.Person;
import com.nc.lab1.comparators.PersonComparator;

public class InsertionSorter implements PersonSorter {

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
        return people;
    }
}
