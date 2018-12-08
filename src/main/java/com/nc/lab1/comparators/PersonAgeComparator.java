package com.nc.lab1.comparators;

import com.nc.lab1.checkers.PersonFullnameChecker;
import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;

public class PersonAgeComparator implements PersonComparator {

    private static final Logger logger = Logger.getLogger(PersonAgeComparator.class);
    public int compare(Person p1, Person p2)
    {
        logger.debug(String.format("Are (%s) and (%s) equal by age? %d", p1.toString(), p2.toString(), p1.getAge() - p2.getAge()));
        return p1.getAge() - p2.getAge();
    }
}
