package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatTest {
    private Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat("Kitty", new Date(12), 12);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedName = "Kitty";
        // When
        cat.setName(expectedName);
        String actualName = cat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);

    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        //Given
        String expectedName = "Kitty";
        //When
        cat.setName(expectedName);
        String actualName = cat.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //Given
        String expectedSpeak = "meow!";
        //When
        String actualSpeak = cat.speak();
        //Then
        Assert.assertEquals(expectedSpeak, expectedSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        //Given
        Date BirthDate = new Date(10);
        Date expectedBirthDate = BirthDate;
        //When
        cat.setBirthDate(BirthDate);
        //Then
        Assert.assertEquals(expectedBirthDate, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //Given
        Food food = new Food();
        Integer numberOfMealsEaten = 1;
        //When
        cat.eat(food);
        //Then
        Assert.assertEquals(numberOfMealsEaten, cat.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //Given
        Integer expectedInt = 12;
        //When
        cat.getId();
        //Then
        Assert.assertEquals(expectedInt, cat.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    //Given
    @Test
    public void testInstanceOfAnimal() {
        //Given
        boolean expectedBoolean = true;
        //When
        boolean actualBoolean = cat instanceof Animal;
        //Then
        Assert.assertEquals(expectedBoolean, actualBoolean);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfMammal() {
        // Given
        boolean expectedBoolean = true;
        //When
        boolean actualBoolean = cat instanceof Mammal;
        //Then
        Assert.assertEquals(expectedBoolean, actualBoolean);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    ;
}
