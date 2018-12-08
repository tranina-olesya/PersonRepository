package com.nc.lab1.checkers;

import com.nc.lab1.main.Person;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

public class PersonDateOfBirthChecker implements PersonChecker {

    private static final Logger logger = Logger.getLogger(PersonDateOfBirthChecker.class);
    public boolean check(Person p, Object value)
    {
        boolean b = value.equals(p.getDateOfBirth());
        logger.debug(String.format("Does Person (%s) match date of birth %s? %s", p.toString(), ((DateTime)value).toString("dd.MM.yyyy"), b));
        return b;
    }
}
