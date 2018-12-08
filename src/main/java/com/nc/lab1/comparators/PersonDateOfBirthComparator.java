package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;

public class PersonDateOfBirthComparator implements PersonComparator {

    private static final Logger logger = Logger.getLogger(PersonDateOfBirthComparator.class);

    public int compare(Person p1, Person p2) {
        logger.debug(String.format("Are (%s) and (%s) equal by date of birth? %d", p1.toString(), p2.toString(), p1.getDateOfBirth().compareTo(p2.getDateOfBirth())));
        return p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
    }
}
