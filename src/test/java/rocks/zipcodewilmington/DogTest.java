package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;
    @Before
    public void setup(){
        this.dog = new Dog("Guy", new Date (2), 22);
    }
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setDogNameTest(){
        //Given
        String givenName = "Guy";
        //When
        dog.setName(givenName);
        //Then
        String newName = dog.getName();
        Assert.assertEquals(givenName, newName);
    }
    // TODO - Create tests for `speak`
        @Test
        public void speakDogTest(){
        //Given
            String expectedSpeak = "bark!";
            //When
            dog.speak();
        //Then
            Assert.assertEquals(expectedSpeak, dog.speak());}
    // TODO - Create tests for `setBirthDate(Date birthDate)`
        @Test
        public void setBirthDateTest(){
        // Given
            Date expectedBirthDate = new Date();
            // When
            dog.setBirthDate(expectedBirthDate);
            // Then
            Assert.assertEquals(expectedBirthDate, dog.getBirthDate());
        }
    // TODO - Create tests for `void eat(Food food)`
        @Test
        public void eatTest(){
        // Given
            Food food = new Food();
            Integer numberOfMeals = 1;
            // When
            dog.eat(food);
            //Then
            Assert.assertEquals(numberOfMeals, dog.getNumberOfMealsEaten());}
        
    // TODO - Create tests for `Integer getId()`
        @Test
        public void getIdTest(){
        //Given
            Integer expectedInteger = 22;
            //When
            dog.getId();
            //Then
            Assert.assertEquals(expectedInteger, dog.getId());}
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        @Test
        public void animalInheritanceTest(){
        //Given
            boolean expectedBoolean = true;
            //When
            boolean actualBoolean = dog instanceof Animal;
            //Then
            Assert.assertEquals(expectedBoolean, actualBoolean);}

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
    //Given
        boolean expectedBoolean = true;
        //When
        boolean actualBoolean = dog instanceof Mammal;
        //Then
        Assert.assertEquals(expectedBoolean, actualBoolean);}
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
