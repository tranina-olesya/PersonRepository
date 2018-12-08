package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;

public class PersonAgeChecker implements PersonChecker {

    private static final Logger logger = Logger.getLogger(PersonAgeChecker.class);

    public boolean check(Person p, Object value)
    {
        boolean b = value.equals(p.getAge());
        logger.debug(String.format("Does Person (%s) match age %s? %s", p.toString(), value.toString(), b));
        return b;
    }
}
