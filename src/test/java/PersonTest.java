import org.example.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private static Person person;

    @BeforeAll
    public static void setUp(){
        person = null;
    }
    @Test
    public void shouldNameBeNullRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person(null, 23, "Female"));
    }

    @Test
    public void shouldNameBeTooShortRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("M", 23, "Female"));
    }

    @Test
    public void shouldNameNotHaveEnoughVowelsRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Mnl", 23, "Female"));
    }

    @Test
    public void shouldNameNotHaveEnoughConsonantsRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("AEIOUaeiou", 23, "Female"));
    }


    @Test
    public void shouldNameJustBeSpacesRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("   ", 23, "Female"));
    }

    @Test
    public void shouldNameHaveCharacterUnderARaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Mar1a", 23, "Female"));
    }

    @Test
    public void shouldNameHaveCharacterBetweenZAndaARaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Mar]a", 23, "Female"));
    }

    @Test
    public void shouldNameHaveCharacterOverzRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Mar{a", 23, "Female"));
    }

    @Test
    public void shouldAgeBeNegativeRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Maria", -1, "Female"));
    }

    @Test
    public void shouldAgeBeOver120RaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Maria", 121, "Female"));
    }

    @Test
    public void shouldGenderBeNullRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Maria", 23, null));
    }

    @Test
    public void shouldGenderNotBeFemaleOrMaleRaiseAnException(){
        assertThrows(RuntimeException.class, ()-> new Person("Maria", 23, "FMale"));
    }

    @Test
    public void shouldNameBeValid(){
        person = new Person("Maria", 23, "Female");
        String expectedValue = "Maria";
        String actualValue =person.name();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldNameNotStartingWithCapitalBeValid(){
        person = new Person("maria", 23, "Female");
        String expectedValue = "maria";
        String actualValue =person.name();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldNameWithSpaceBeValid(){
        person = new Person("Maria Victoria", 23, "Female");
        String expectedValue = "Maria Victoria";
        String actualValue =person.name();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldAgeBeValid(){
        person = new Person("Maria", 23, "Female");
        int expectedValue = 23;
        int actualValue =person.age();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldGenderFemaleBeValid(){
        person = new Person("Maria", 23, "Female");
        String expectedValue = "Female";
        String actualValue =person.gender();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldGenderMaleBeValid(){
        person = new Person("Lucas", 23, "Male");
        String expectedValue = "Male";
        String actualValue =person.gender();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldListBeNullThrowAnException(){
        assertThrows(RuntimeException.class, ()-> Person.averageAgePerGender(null));
    }

    @Test
    public void shouldListBeSize0ThrowAnException(){
        List<Person> lista = new ArrayList<Person>();

        assertThrows(RuntimeException.class, ()-> Person.averageAgePerGender(lista));
    }

}
