package com.nc.lab1.main;

import com.nc.lab1.sorters.BubbleSorter;
import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args)
    {
        PersonList p = new PersonList();

        p.addPerson(new Person("Ira", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female));
        for(int i = 0; i < 2; i++)
            p.addPerson(new Person("Anya " + i, new DateTime(2010, 12, 15, 0,0), Person.Sex.Female));
        p.addPerson(new Person("Misha", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Nikita", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Nastya", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female));

        PersonList a = p.searchByFullname("Anya");
        PersonList b = p.searchByAge(20);
        PersonList c = p.searchByDateOfBirth(new DateTime(2010, 12, 15, 0,0));
        p.sortByAge();
        p.sortByFullName();
        p.sortByDateOfBirth();
        System.out.println(1);
    }
}