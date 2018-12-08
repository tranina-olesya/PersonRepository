package com.nc.lab1.comparators;

import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;

public class PersonFullnameComparator implements PersonComparator {

    private static final Logger logger = Logger.getLogger(PersonFullnameComparator.class);

    public int compare(Person p1, Person p2) {
        logger.debug(String.format("Are (%s) and (%s) equal by fullname? %d", p1.toString(), p2.toString(), p1.getFullName().compareTo(p2.getFullName())));
        return p1.getFullName().compareTo(p2.getFullName());
    }
}
