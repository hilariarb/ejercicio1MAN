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

}
