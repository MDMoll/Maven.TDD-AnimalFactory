package rocks.zipcodewilmington;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    private DogHouse dogHouse;
    private Dog bigDog;
    private Dog smallDog;

    @Before
    public void setup(){
        this.dogHouse = new DogHouse();
        this.bigDog = new Dog("Jasper", new Date(7), 1);
        this.smallDog = new Dog("Jasmine", new Date(8), 2);}
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        //Given
        Integer expectedInt = 1;
        //When
        dogHouse.add(bigDog);
        //Then
        Assert.assertEquals(expectedInt, dogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        //Given
        dogHouse.add(bigDog);
        dogHouse.remove(1);
        Integer expectedInt = 0;
        //When
        //Then
        Assert.assertEquals(expectedInt, dogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByNameTest(){
        //Given
        dogHouse.add(bigDog);
        dogHouse.add(smallDog);
        dogHouse.remove(1);
        Integer expectedDogNumber = 1;
        //When
        //Then
        Assert.assertEquals(expectedDogNumber, dogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        //Given
        dogHouse.add(bigDog);
        //When
        //Then
        Assert.assertEquals(dogHouse.getDogById(1), bigDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        //Given
        //When
        //Then
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @After
    public void tearDown(){
        this.dogHouse.clear();
    }
}
