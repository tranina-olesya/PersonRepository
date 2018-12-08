package com.nc.lab1.main;

import com.nc.lab1.checkers.PersonAgeChecker;
import com.nc.lab1.checkers.PersonChecker;
import com.nc.lab1.checkers.PersonDateOfBirthChecker;
import com.nc.lab1.checkers.PersonFullnameChecker;
import com.nc.lab1.comparators.PersonAgeComparator;
import com.nc.lab1.comparators.PersonDateOfBirthComparator;
import com.nc.lab1.comparators.PersonFullnameComparator;
import com.nc.lab1.inject.Injectable;
import com.nc.lab1.inject.Injector;
import com.nc.lab1.sorters.PersonSorter;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.util.Arrays;

public class PersonList {
    private Person[] people = new Person[10];
    private int count = 0;

    @Injectable
    private PersonSorter sorter;

    private static final Logger logger = Logger.getLogger(PersonList.class);

    public PersonList()
    {
        logger.info("New PersonList was created");
        (new Injector()).inject(this);
    }

    /**
     * Gets number of people in list
     * @return number of people in list
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Adds person to List
     * @param person to add
     */
    public void addPerson(Person person)
    {
        if (count >= people.length)
        {
            people = Arrays.copyOf(people, people.length + (people.length >> 1));
        }

        people[count] = person;
        count++;
        logger.debug(String.format("Person (%s) was added to list", person.toString()));
    }

    /**
     * Find person by id
     * @param id person's id
     * @return person with given id
     */
    public Person getById(int id)
    {
        if (id < count) {
            logger.debug(String.format("Person with id %d returned", id));
            return people[id];
        }
        logger.debug(String.format("Trying to get person with id %d, but nobody found", id));
        return null;
    }

    /**
     * Delete person by id
     * @param id person's id
     */
    public void deleteById(int id)
    {
        if (id <= count)
        {
            count--;
            for (int i = id - 1; i < count; i++)
            {
                people[i] = people[i+1];
            }

            people[count] = null;
            logger.debug(String.format("Person with id %d was deleted", id));
        }
        else
            logger.debug(String.format("Trying to delete person with id %d, but nobody found", id));
    }

    /**
     * Search person using checker
     * @param checker checks if person match
     * @param value value for age
     * @return list with people that math checker
     */
    private PersonList search(PersonChecker checker, Object value)
    {
        PersonList res = new PersonList();
        for (int i = 0; i < count; i++)
            if(checker.check(people[i], value))
                res.addPerson(people[i]);
        return res;
    }

    /**
     * Search by full name
     * @param fullname person's full name
     * @return people who has full name like that
     */
    public PersonList searchByFullname(String fullname)
    {
        logger.debug(String.format("Search people with fullname \'%s\'", fullname));
        return search(new PersonFullnameChecker(), fullname);
    }

    /**
     * Search by age
     * @param age person's age
     * @return people who has age like that
     */
    public PersonList searchByAge(int age)
    {
        logger.debug(String.format("Search people with age %d", age));
        return search(new PersonAgeChecker(), age);
    }

    /**
     * Search by date of birth
     * @param dateOfBirth person's date of birth
     * @return people who has date of birth like that
     */
    public  PersonList searchByDateOfBirth(DateTime dateOfBirth)
    {
        logger.debug(String.format("Search people with date of birth %s", dateOfBirth.toString("dd.MM.yyyy")));
        return search(new PersonDateOfBirthChecker(), dateOfBirth);
    }

    /**
     * Sort people in this list by full name
     */
    public void sortByFullName(){
        people = sorter.sort(Arrays.copyOf(people, count), new PersonFullnameComparator());
    }

    /**
     * Sort people in this list by age
     */
    public void sortByAge()
    {
        people = sorter.sort(Arrays.copyOf(people, count), new PersonAgeComparator());
    }

    /**
     * Sort people in this list by date of birth
     */
    public void sortByDateOfBirth()
    {
        people = sorter.sort(Arrays.copyOf(people, count), new PersonDateOfBirthComparator());
    }
}
