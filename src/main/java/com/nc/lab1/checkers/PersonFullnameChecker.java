package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;

public class PersonFullnameChecker implements PersonChecker {

    private static final Logger logger = Logger.getLogger(PersonFullnameChecker.class);

    public boolean check(Person p, Object value)
    {
        boolean b = p.getFullName().contains((String)value);
        logger.debug(String.format("Does Person (%s) match fullname %s? %s", p.toString(), value.toString(), b));
        return b;
    }
}
