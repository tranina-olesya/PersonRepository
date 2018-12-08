import com.nc.lab1.comparators.PersonAgeComparator;
import com.nc.lab1.comparators.PersonDateOfBirthComparator;
import com.nc.lab1.comparators.PersonFullnameComparator;
import com.nc.lab1.main.Person;
import com.nc.lab1.main.PersonList;
import com.nc.lab1.sorters.BubbleSorter;
import com.nc.lab1.sorters.InsertionSorter;
import com.nc.lab1.sorters.SelectionSorter;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testBubbleSortByDateOfBirth()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new BubbleSorter().sort(people, new PersonDateOfBirthComparator());
        Arrays.sort(people, (o1, o2) -> -o1.getDateOfBirth().compareTo(o2.getDateOfBirth()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testBubbleSortByAge()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new BubbleSorter().sort(people, new PersonAgeComparator());
        Arrays.sort(people, (o1, o2) -> o1.getAge()- (o2.getAge()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testBubbleSortByFullName()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new BubbleSorter().sort(people, new PersonFullnameComparator());
        Arrays.sort(people, (o1, o2) -> p1.getFullName().compareTo(p2.getFullName()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testInsertionSortByDateOfBirth()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new InsertionSorter().sort(people, new PersonDateOfBirthComparator());
        Arrays.sort(people, (o1, o2) -> -o1.getDateOfBirth().compareTo(o2.getDateOfBirth()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testInsertionSortByAge()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new InsertionSorter().sort(people, new PersonAgeComparator());
        Arrays.sort(people, (o1, o2) -> o1.getAge()- (o2.getAge()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testInsertionSortByFullName()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new InsertionSorter().sort(people, new PersonFullnameComparator());
        Arrays.sort(people, (o1, o2) -> p1.getFullName().compareTo(p2.getFullName()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testSelectionSortByDateOfBirth()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new SelectionSorter().sort(people, new PersonDateOfBirthComparator());
        Arrays.sort(people, (o1, o2) -> -o1.getDateOfBirth().compareTo(o2.getDateOfBirth()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testSelectionSortByAge()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new SelectionSorter().sort(people, new PersonAgeComparator());
        Arrays.sort(people, (o1, o2) -> o1.getAge()- (o2.getAge()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testSelectionSortByFullName()
    {
        Person  p1 = new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female),
                p2 = new Person("Аня", new DateTime(2010, 12, 15, 0,0), Person.Sex.Female),
                p3 = new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male),
                p4 = new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male),
                p5 = new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female);
        Person[] people = new Person[]{p1, p2, p3, p4, p5};
        Person[] expectedPeople = new SelectionSorter().sort(people, new PersonFullnameComparator());
        Arrays.sort(people, (o1, o2) -> p1.getFullName().compareTo(p2.getFullName()));
        assertEquals(expectedPeople, people);
    }

    @Test
    public void testSearchByName()
    {
        PersonList p = new PersonList();

        p.addPerson(new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female));
        for(int i = 0; i < 2; i++)
            p.addPerson(new Person("Аня " + i, new DateTime(2010, 12, 15, 0,0), Person.Sex.Female));
        p.addPerson(new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female));

        PersonList expectedPeople = new PersonList();
        expectedPeople.addPerson(p.getById(1));
        expectedPeople.addPerson(p.getById(2));

        PersonList people = p.searchByFullname("Аня");

        for (int i = 0; i < people.getCount(); i++)
            assertEquals(people.getById(i), expectedPeople.getById(i));
    }

    @Test
    public void testSearchByAge()
    {
        PersonList p = new PersonList();

        p.addPerson(new Person("Ира", new DateTime(1998, 4, 15, 0,0), Person.Sex.Female));
        for(int i = 0; i < 2; i++)
            p.addPerson(new Person("Аня " + i, new DateTime(2010, 12, 15, 0,0), Person.Sex.Female));
        p.addPerson(new Person("Миша", new DateTime(1999, 5, 7, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Никита", new DateTime(1998, 5, 19, 0,0), Person.Sex.Male));
        p.addPerson(new Person("Настя", new DateTime(1998, 6, 23, 0,0), Person.Sex.Female));

        PersonList expectedPeople = new PersonList();
        expectedPeople.addPerson(p.getById(0));

        PersonList people = p.searchByDateOfBirth(new DateTime(1998, 4, 15, 0,0));

        for (int i = 0; i < people.getCount(); i++)
            assertEquals(people.getById(i), expectedPeople.getById(i));
    }
}
